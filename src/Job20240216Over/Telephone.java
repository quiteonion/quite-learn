package Job20240216Over;

public class Telephone {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3,7,6,8,9,3};
        int[] arr1 = {0,5,5,2,8,6,6,0,9,5,3};

        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            System.out.print(arr[num]);
        }
    }
}
