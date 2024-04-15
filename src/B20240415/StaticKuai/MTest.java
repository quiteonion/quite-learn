package B20240415.StaticKuai;

public class MTest {
    private String name;
    private static int id = 1;
    {
        id++;
    }

    public MTest() {
    }

    public MTest(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
