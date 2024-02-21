package Job20240216Over;



public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 0, 7, 6, 2, 4};
        //存在一个数组，数组内容混乱，要求排序整理
        //使用冒泡排序法
        /**
         * 冒泡排序法：
         * 由前到后逐一对比逐一排序
         */
        //先让  arr[0] 与arr[1] 对比
        int i = arr[0] > arr[1] ? 1 : 0;
        //如果arr[0] 比arr[1]大就交换位置
        if (arr[0]>arr[1]){
            int o = arr[0];
            arr[0] = arr[1];
            arr[1] = o;
        }
        //以此类推，直至结束
        if (arr[1]>arr[2]){
            int o = arr[1];
            arr[1] = arr[2];
            arr[2] = o;
        }
        //.........
    }
}
