package B20240526;

public class PhoneNumber {
    public static void main(String[] args) {
        //已知两个数组，怎么获取自己的电话号码
        int[] arr1 = {1,4,2,7,5,3,6,9,0,8};
        int[] arr2 = {0,3,3,4,7,6,6,0,5,3,2};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[arr2[i]]);
        }
    }
}
