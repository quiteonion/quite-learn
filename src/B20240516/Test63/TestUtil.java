package B20240516.Test63;

public class TestUtil {
    public static boolean confirmPassword(String password , String rPassword){
        if (password.equals(rPassword)){
            return true;
        }
        return false;
    }
}
