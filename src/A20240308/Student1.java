package A20240308;

public class Student1 {
    private int id;
    private int state;
    private int score;

    public Student1() {
    }

    public Student1(int id, int state, int score) {
        this.id = id;
        this.state = state;
        this.score = score;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return state
     */
    public int getState() {
        return state;
    }

    /**
     * 设置
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * 获取
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    public static void displayStudent(int number, Student1[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i].getState()){
                System.out.println("学号："+arr[i].getId()+"年级："+arr[i].getState()+"成绩："+arr[i].getScore());
            }
        }
    }

    public static void sort(int number, Student1[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].getScore()>arr[j+1].getScore()){
                    Student1 m = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = m;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("学号，"+arr[i].getId()+"年级，"+arr[i].getState()+"成绩"+arr[i].getScore());
        }
    }
}
