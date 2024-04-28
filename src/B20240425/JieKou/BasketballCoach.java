package B20240425.JieKou;

public class BasketballCoach extends Coach {
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void CO() {
        System.out.println("教打篮球");
    }
}
