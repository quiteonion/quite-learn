package B20240402;

public class Movie {
    public static void main(String[] args) {
        NumberMain m1 = new NumberMain("十面埋伏",10,"菜加生");
        NumberMain m2 = new NumberMain("八面埋伏",10,"苏要疯");
        NumberMain m3 = new NumberMain("六面埋伏",10,"玉军熊");
        m1.speed();
        m2.speed();
        m3.speed();
    }
}
class NumberMain{
    private String movieName;
    private int score;
    private String starringName;


    public NumberMain() {
    }

    public NumberMain(String movieName, int score, String starringName) {
        this.movieName = movieName;
        this.score = score;
        this.starringName = starringName;
    }

    /**
     * 获取
     * @return movieName
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * 设置
     * @param movieName
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    /**
     * 获取
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * 获取
     * @return starringName
     */
    public String getStarringName() {
        return starringName;
    }

    /**
     * 设置
     * @param starringName
     */
    public void setStarringName(String starringName) {
        this.starringName = starringName;
    }

    public void speed(){
        System.out.println("电影名称\t电影评分\t电影主演");
        System.out.println(this.movieName+"\t"+this.score+"\t"+this.starringName);
    }
}
