package A20240324.LonelyAndGOB;

public class Student extends Person{
    public Student (String name){
        super(name);
    }
    public void lonely(String lonelyu){
        System.out.println(this.name+"觉得孤独是"+lonelyu);
    }

   /* @Override
    public void PingJia(String Test) {
        super.PingJia(Test);
    }*/
}
