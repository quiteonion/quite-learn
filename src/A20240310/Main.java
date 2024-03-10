package A20240310;

public class Main {
    private String name;

    private static Main instance;


    private Main() {
    }

    public static Main getInstance() {
        if (instance == null){
            instance = new Main();
        }
        return instance;
    }


}
