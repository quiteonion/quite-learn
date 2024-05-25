package A20240525;

public class StringCommonMethod {
    public static void main(String[] args) {
        String code = "asagaf";
        String codeUpperCase = code.toUpperCase();
        System.out.println(codeUpperCase);
        System.out.println("=== === ===");
        System.out.println(code.equals(codeUpperCase));
        System.out.println(code.equalsIgnoreCase(codeUpperCase));
    }
}
