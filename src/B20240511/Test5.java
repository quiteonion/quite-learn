package B20240511;

public class Test5 {
    public static void main(String[] args) {
        //将下列文字中的凡是涉及到“恐怖”“爆炸”“军火”的敏感词过滤掉，然后输出。
        //“车臣恐怖分子计划利用爆炸摧毁政府的军火库。”
        String[] arr = {"恐怖", "爆炸", "军火"};
        String n = "车臣恐怖分子计划利用爆炸摧毁政府的军火库。";
        StringBuffer SB = new StringBuffer();
        SB.append(n);
        for (int i = 0; i < arr.length; i++) {
        }
    }
}
