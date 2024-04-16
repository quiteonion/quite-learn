package B20240416;

public class AboutStringBuffer {
    public static void main(String[] args) {
        StringBuffer SB = new StringBuffer();
        SB.append(1);
        SB.append(2);
        SB.append(5);
        SB.append(4);
        SB.append(3);
        System.out.println(SB);
        //关于 StringBuffer 的添加

        //delete
        System.out.println(SB.delete(1, 3));

        SB.append(143454);
        System.out.println(SB);

        SB.indexOf("12",2);
        System.out.println(SB);
    }
}
