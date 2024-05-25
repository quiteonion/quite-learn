package A20240525;

public class StringCommonMethod2 {
    public static void main(String[] args) {
        //把手机号码隐藏起来
        String Phone = "17759661372";
        System.out.println(Phone.replace(Phone.substring(3, 7), "****"));


        System.out.println("=== === ===");

        //把骂人的话隐藏起来
        String s1 = "sb";
        String s2 = "epsbifsbbsdjdvssbjhbsbsbfjdoissbfhsb";
        System.out.println(s2.replace(s1, "**"));


        System.out.println("=== === ===");

        //把骂人的话隐藏起来
        String[] words = new String[]{"包子","傻逼","良心"};
        String s3 = "早上买的包子很好吃 ， 但是老板说他是傻逼 ， 但是我还是觉得他很良心";
        for (int i = 0; i < words.length; i++) {
            s3 =  s3.replace(words[i] , "**");
        }
        System.out.println(s3);
    }
}
