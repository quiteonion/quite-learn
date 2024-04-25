package B20240435.JieKou;

public class TableTennisCoach extends Coach implements LearnEnglish{
    public TableTennisCoach(String name, int age) {
        super(name, age);
    }
    public void CO(){
        System.out.println("教打乒乓球");
    }

    public void Learn() {
        System.out.println(this.getName()+"学英语");
    }
}
