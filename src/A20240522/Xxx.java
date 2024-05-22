package A20240522;

public class Xxx {
    private String name;
    private String number;

    public Xxx(String name, String number) {
        this.name = name;
        this.number = number;
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
