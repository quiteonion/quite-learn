package A20240308;

public class CirculateArrayText {
    public static void main(String[] args) {
        CirculateArray[] arr = new CirculateArray[3];
        CirculateArray c1 = new CirculateArray("asd",17);
        arr[0] = c1;
        for (CirculateArray circulateArray : arr) {
            System.out.println(circulateArray);
        }
    }
}
