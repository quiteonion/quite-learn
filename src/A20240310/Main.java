package A20240310;

public class Main {
    private String name;

    static Main instance = new Main();


    private Main(){}
    public static Main getInstance(){
        return instance;
    }


}
