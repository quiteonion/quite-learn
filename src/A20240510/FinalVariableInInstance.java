package A20240510;

public class FinalVariableInInstance {
    public static void main(String[] args) {

    }
}
class instance{
    final int i = 0;

    //Identifier expected
    //Unexpected token
    i = 9;

    public void addI(int i){
        //Cannot assign a value to final variable 'i( In the variable you use the final modifier )'
        this.i = i;
    }
}
