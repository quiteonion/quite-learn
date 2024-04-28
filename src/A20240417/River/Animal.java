package A20240417.River;

public class Animal {
    private String name;
    protected int location = 0;

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

    public void addLocation() {
        this.location += 1;
    }
    public void deleteLocation() {
        this.location -= 1;
    }
    public int getLocation(){
        return this.location;
    }
}
