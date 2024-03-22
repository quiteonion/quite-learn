package A20240322;

public class ModifierTest1 {
    private String name;
    protected int age;
    char genger;
    public String class1;

    public ModifierTest1() {
    }

    public ModifierTest1(String name, int age, char genger, String class1) {
        this.name = name;
        this.age = age;
        this.genger = genger;
        this.class1 = class1;
    }

    private String eat(){
        return "eating...";
    }

    private void play(){
        System.out.println("playing...");
    }

    protected void fly(){
        System.out.println("flying....");
    }
    protected int jump(){
        return 1;
    }
    double hight(){
        return 178;
    }
    void stride(){
        System.out.println("3 m");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
