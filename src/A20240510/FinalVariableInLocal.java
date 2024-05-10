package A20240510;

public class FinalVariableInLocal {
    public static void main(String[] args) {

    }
}
class LocalVariable{
    int instance = 0;
    static int classvar = 0;
    public void localVariable(int j){
        final int i = 0;
        //Cannot assign a value to final variable 'i'
        i = j;
    }
}
