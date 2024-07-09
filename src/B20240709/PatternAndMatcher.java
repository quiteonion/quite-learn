package B20240709;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*");
        Matcher matcher = pattern.matcher("21414562");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        /**
         * Matcher 中有两个方法
         * find() ：从字符串第一个索引开始查找是否有与正则表达式匹配的，如果有匹配的记录为[左索引, 右索引+1]
         * group() ：把当前匹配的获取出来 底层调用 subString 方法（包左不包右）
         */
    }
}
