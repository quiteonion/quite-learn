package B20240715;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        //贪婪爬取与非贪婪爬取
        //例如 abbbbbbbbbbbbbbbbbbgsdgsjkjhb

        //贪婪爬取 ab+ || ab*
        //贪婪爬取要求获取到更多的 b

        //非贪婪爬取 ab+? || ab*?
        //非贪婪爬取在满足要求的前提下少获取 b

        String n = "abbbbbbbbbbbbgskuehglus";
        Pattern pattern = Pattern.compile("ab+?");
        Matcher matcher = pattern.matcher(n);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
