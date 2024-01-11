package Day004;

public class Character {
    //主角和敌对人物开局都是 2 血 ，玩一把结束之后，主角如果继续，就+1 血，最高血量不超过 5
    private String name;
    private int boold;

    public Character() {
    }

    public Character(String name, int boold) {
        this.name = name;
        this.boold = boold;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getBoold() {
        return boold;
    }


    public void setBoold(int boold) {
        this.boold = boold;
    }

}
