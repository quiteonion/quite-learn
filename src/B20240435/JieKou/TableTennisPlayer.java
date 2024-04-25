package B20240435.JieKou;

public class TableTennisPlayer extends Player implements LearnEnglish {
    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }
    public void PL(){
        System.out.println("学打乒乓球");
    }

    @Override
    public void Learn() {
        System.out.println(super.getName()+"学英语");
    }
}
