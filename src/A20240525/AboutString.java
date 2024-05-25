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

        String q1 = "123";
        String q2 = "456";
        String q3 = "123456";
        String q4 = "123" + "456";
        String q5 = q1 + "456";
        String q6 = "123" + q2;
        String q7 = q1 + q2;
        System.out.println(q3 ==q4);
        System.out.println(q3 ==q5);
        System.out.println(q3 ==q6);
        System.out.println(q3 ==q7);
        System.out.println(q4 ==q5);
        System.out.println(q5 ==q6);
        System.out.println(q6 ==q7);

        System.out.println("=== === ===");


    }
}
