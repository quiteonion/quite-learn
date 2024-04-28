package B20240425.JieKou;

public class BasketballPlayer extends Player {
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void PL(){
        System.out.println("学习打篮球");
    }
}
