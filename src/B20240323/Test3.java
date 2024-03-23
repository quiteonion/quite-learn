package B20240323;

public class Test3 {
    public static void main(String[] args) {
        a aa = new a();

    }
}

class A{
    public void eat(){
        System.out.println("eat rice");
    }

    public void play(){
        System.out.println("playing");
    }
    public String fly(){
        return "flying";
    }
    public double math(){
        return 1+1;
    }
}

class a extends A{
    public void eat(){
        System.out.println("eat noodles");
    }
    //public String play(){
    //    return "playing game";
    //}
    //public void fly(){1
    //}
    public byte math(){
        return 1+1;
    }

}



