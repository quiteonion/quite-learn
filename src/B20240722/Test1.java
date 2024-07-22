package B20240722;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        m(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void m(int[] arr, int a, int b) {
        int begin = a;
        int end = b;

        int o = a;
        if (a > b) {
            return;
        }
        while (b > a) {
            int benchmark = arr[o];
            while (b > a) {
                if (arr[b] < benchmark) {
                    break;
                }
                b--;
            }
            while (b > a) {
                if (arr[a] > benchmark) {
                    break;
                }
                a++;
            }
            int p = arr[a];
            arr[a] = arr[b];
            arr[b] = p;

        }
        int p = arr[a];
        arr[a] = arr[o];
        arr[o] = p;
        m(arr, begin,  b- 1);
        m(arr, b + 1, end);
    }

}
