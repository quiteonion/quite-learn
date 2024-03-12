package B20240312;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a  = "qwe";
        System.out.println(sb);
        sb.append(a);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int s = sb.length();
        System.out.println(s);
        String m = sb.toString();
        System.out.println(m);
    }
}
