package B20240723;

import java.util.Arrays;

public class LambdaTest1 {
    public static void main(String[] args) {
        /**
         * 按年龄排，年龄一样就身高，身高一样就首字母
         */
        GF[] arr = {new GF("aaa",18,180)
                , new GF("vvv", 13,140)
                , new GF("aaa", 13, 140)
                , new GF("ggg", 15, 180)
                , new GF("gaf", 16, 150)
                , new GF("hhh", 23, 146)
                , new GF("vaa", 13, 246)};
        Arrays.sort(arr, ((o1, o2) -> GF.m(o1,o2)));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}

class GF {
    String name;
    int age;
    int height;

    public GF(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static int m(GF o1, GF o2) {
        if (o1.age != o2.age) {
            return o1.age - o2.age;
        } else if (o1.height != o2.height){
            return o1.height - o2.height;
        }else {
            return (int)(o1.name.charAt(0)) - (int)(o2.name.charAt(0));
        }
    }

    @Override
    public String toString() {
        return "GF{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
