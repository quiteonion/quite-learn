package A20240130;

public class Mainwo {
    private String  name;
    private String var;
    private  int age;

    public  Mainwo(){}

    public Mainwo(String name , String var , int age){
        this.name = name;
        this.var  =var;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
