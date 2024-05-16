package B20240516.Test63;

public class TestUtil {
    public static boolean confirmPassword(String password , String rPassword){
        if (password.equals(rPassword)){
            return true;
        }
        return false;
    }
    public static boolean confirmBirthday(String birthday){
        if (birthday.length() != 10){
            return true;
        }
        StringBuffer SB = new StringBuffer();
        SB.append(birthday);
        SB.replace(4,5,"-");
        SB.replace(7,8,"-");
        String newBirthday = SB.toString();
        if (newBirthday.equals(birthday)){
            return false;
        }
        return true;
    }
}
