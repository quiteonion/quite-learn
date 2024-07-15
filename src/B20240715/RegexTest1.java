package B20240715;

public class RegexTest1 {
    public static void main(String[] args) {
//        replaceAll(String regex, String str) 将替换满足规则的所有字符替换成 str
//        split(String regex) 在满足规则的字符进行切割，留下剩余的字符。 返回字符数组
        String s = "糖醋鱼asdfghjkl123安静asdfghjkl123小林";
        String and = s.replaceAll("[\\w&&[^_]]+", "and");
        System.out.println(and);

    }
}
