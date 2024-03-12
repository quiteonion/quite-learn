package B20240312;

public class Main {
    private int id;

    /*private static final Main m = new Main();*//**/

    private static Main m;

    private Main(){
    }
    public static Main getM(){
        if (m == null){
            m = new Main();
        }
        return m;
    }


}
