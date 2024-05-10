package A20240510;

public class FinalVariableInClass {
    public static void main(String[] args) {

    }
}
class ClassVariable{
    int instanceVariable = 0;
    static final int i = 0;
    public void classVariable(int j){

        instanceVariable = j;
        //Cannot assign a value to final variable 'i'
        //i = j;
    }

}
