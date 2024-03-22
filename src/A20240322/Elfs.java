package A20240322;

public class Elfs {
    private String name;
    private int blood;
    private char ability;


    public Elfs() {
    }

    public Elfs(String name, int blood, char ability) {
        this.name = name;
        this.blood = blood;
        this.ability = ability;
    }


    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }


    public int getBlood() {
        return blood;
    }


    protected void setBlood(int blood) {
        this.blood = blood;
    }


    public char getAbility() {
        return ability;
    }


    protected void setAbility(char ability) {
        this.ability = ability;
    }


}
