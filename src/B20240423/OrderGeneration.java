package B20240423;

public class OrderGeneration {
    public static void main(String[] args) {
        int[] arr = {2020,0504,1101};
        System.out.println("arr = ["+array(arr)+"]");
    }
    public static String array(int[] arr){
        StringBuffer SB = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            SB.append(arr[i]);
        }
        return SB.toString();
    }
}
