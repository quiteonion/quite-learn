package B20240709;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest {
    public static void main(String[] args) {
        String s = "来学习Java" + "电话： 18512516712, 18512508942" +
                "或者联系邮箱：binou@castit.cn," +
                "座机电话： 01035519483, 010-92472567" +
                "邮箱: zaibo@casiti.cn," +
                "热线电话: 400-645-8030 , 400-253-2356, 3238273819, 4882937050";

        Pattern phone = Pattern.compile("1\\d{10}");
        Matcher phone1 = phone.matcher(s);
        while (phone1.find()) {
            System.out.println(phone1.group());
        }
        Pattern email = Pattern.compile("\\w*@\\w*.cn");
        Matcher email1 = email.matcher(s);
        while (email1.find()) {
            System.out.println(email1.group());
        }
        Pattern zuojiNumber = Pattern.compile("0\\d{2}-?\\d{8}");
        Matcher zuojiNumber1 = zuojiNumber.matcher(s);
        while (zuojiNumber1.find()) {
            System.out.println(zuojiNumber1.group());
        }
        Pattern pattern = Pattern.compile("\\d{3}-?\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
