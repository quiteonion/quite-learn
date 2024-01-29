package A20040129;

//已知两个数组，要使用两个数组来求出自己的电话号码
public class TelephoneNumber {
    public static void main(String[] args) {
        //存在两个数组，数组内存储数字
        int[] arr1 = {8, 2, 1, 0, 3};// 5
        int[] arr2 = {2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};// 11
        //求出代码中隐藏的电话号码
        //已知电话号码是11个数字组成
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[arr2[i]]);
        }
    }
}
