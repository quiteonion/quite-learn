package A20240525;

public class AboutString {
    public static void main(String[] args) {
        String s1 = new String("123");
        String s2 = new String("123");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("=== === ===");

        String s3 = "123";
        String s4 = "123";
        System.out.println(s3 == s4);

        System.out.println("=== === ===");
    }
}
