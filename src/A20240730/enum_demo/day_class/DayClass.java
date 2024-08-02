package A20240730.enum_demo.day_class;

public class DayClass {
    String day;
    public DayClass(String day){
        this.day = day;
    }
    static final DayClass MONDAY = new DayClass("MONDAY");
    static final DayClass TUESDAY = new DayClass("TUESDAY");
    static final DayClass WEDNESDAY = new DayClass("WEDNESDAY");
    static final DayClass THURSDAY = new DayClass("THURSDAY");
    static final DayClass FRIDAY = new DayClass("FRIDAY");
    static final DayClass SATURDAY = new DayClass("SATURDAY");
    static final DayClass SUNDAY = new DayClass("SUNDAY");

    public String toString(){
        return day;
    }
}
