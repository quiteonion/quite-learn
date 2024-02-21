package Job20240216Over;

public class Telephone {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3,7,6,8,9,3};
        int[] arr1 = {0,5,5,2,8,6,6,0,9,5,3};
        /**
         * 已知条件
         * 1、两个数组
         * 2、从数组内提取出电话号码
         */
        //观察一下，两个数组有什么不同  arr共有10个元素，arr1共有11个元素
        //根据常识可以知道，电话号码有11位数

        //两个数组之间的关系：数组内元素都是数字，一个数组在使用时包括 arr[i] arr -- 数组名 ， i -- 数组下标
        //两个数组的关系就是下标，一个数组内的元素恰恰好可以作为另一个数组的下标，而恰好arr1有11个数字

        //所以大胆尝试 将一个数组内的数值作为另一个数组的下标
        //先循环出数组的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
