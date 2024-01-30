public class A20240130 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,50,30,70,80,20,40,90,60};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20){
                System.out.println("在arr中找到了"+20);
                break;
            }
        }
        System.out.println("10不存在");
    }
}
