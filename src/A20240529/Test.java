package A20240529;

public class Test {
    public static void main(String[] args) {
        String fileName1 = "MyStringBuilder.java";
        String fileName2 = "My.StringBuilder.java";
        String fileName3 = "abc.txt";
        String fileName4 = "xyz_.80_i.png";

        while (true){
            int i = fileName4.indexOf(".");
            if (fileName4.indexOf("." , i+1) != -1){
                int j = fileName4.indexOf("." , i+1);
                i = j;
            }
            System.out.println(fileName4.substring(i));
            break;
        }

    }
}
