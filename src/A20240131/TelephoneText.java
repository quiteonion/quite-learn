package A20240131;

public class TelephoneText {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("华为 mate 60 pro ",7899,"雅丹黑" );
        Telephone telephone1 = new Telephone("iPhone 15 pro ", 6949 , "白色钛金属");
        telephone.play(telephone.getBrand());
        telephone1.play(telephone1.getBrand());
        telephone.connnection();
        telephone1.connnection();
    }
}
