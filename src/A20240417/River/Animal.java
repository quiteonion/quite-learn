package A20240417.River;

public class Animal {
    private String name;
    protected int location = -1;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean surrounding(Animal[] animal){

        return false;
    }
}
