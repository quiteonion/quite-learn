package B20240319;

public class ReturnWord {
    public static void main(String[] args) {
        String s = "whuosdfh oi";
        int number = mun(s);
        if (number != s.length()){
            for (int i = number; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
        }else {
            System.out.println(s);
        }
    }
    public static int mun (String s ){
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' '){
                return i ;
            }
        }
        return s.length();
    }
}
