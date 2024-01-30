package A20240130;

public class TwoFenFa {
    //通过二分法查找数组中相同的数字
    public static void main(String[] args) {
        //存在一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //要查找一个数字
        int found = 1;
        //要进行二分法查找就先引入一半的那个数值
        int zhongjian = arr[arr.length / 2];
        //在这个顺序结构中进行判断，如果要查找的数字大于则在其之后，若小于则在其之前
        //不知道循环的次数，但是知道循环的结果用while循环
        //循环的条件是在找到数字或者已经明白数字不存在之后，在此之前先定义一个数组的下表
        int i = arr.length / 2;
        //当前的数组最小数
        int a = 0;
        //当前数组最大数
        int b = arr.length;
        boolean flag = true;
        while (b > a) {
            //内容便是判断中间的数值是否为我们要查找的数值
            //判断是否相等
            if (arr[i] != found) {
                if (found > zhongjian) {
                    //如果大于中间值,那么就取当前值与最大值的和的中间值再进行对比
                    a = i + 1;
                    i = (i + b) / 2;
                } else if (found < zhongjian) {
                    //如果小于中间值
                    b = i - 1;
                    i = (i + a) / 2;
                }
            } else {
                //如果等于中间值
                System.out.println("数组中下标为" + i + "位就是这个数字，数字为" + arr[i]);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("不存在这个数字");
        }
    }
}
