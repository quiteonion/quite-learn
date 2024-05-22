package A20240522;

public class Xxx {
    private String name;
    private String number;

    public Xxx(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Xxx(int name, int number) {
        this("实训室" + name, number + "台风扇");
    }
    public Xxx(String name, int number) {
        this(name, number + "台风扇");
    }

    public void set(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void get(String name) {
        if (name.equals(this.name)) {
            System.out.println(this.number);
        }
    }
}
