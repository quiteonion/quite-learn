package Day011;

/*
定义一个方法，把int 数组中的数据按照指定的格式拼接成一个字符串返回调用该方法，并在控制台输出结果例如:

        数组为int]arr ={1,2,3);
        执行方法后的输出结果为:[1,2,3]
*/
public class Person1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        number(arr);
    }

    public static String number(int[] arr) {
        String[] arrr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrr[i] = String.valueOf(arr[i]);
        }
        return arrr[arr.length];
    }
    public static String num(String[] arr){

    }
}
