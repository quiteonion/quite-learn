package Day002;

public class Student {
   private int studentId;
   private int score;

   public Student(){
   }
   public Student(int score , int studentId){
       this.studentId = studentId;
       this.score = score;
   }

   public int getStudentId(){
       return studentId;
   }
   public void setStudentId(int studentId){
       this.studentId = studentId;
   }
   public int getScore(){
       return score;
   }
   public void setScore(int score){
       this.score = score;
   }
}
 /*定义一个名为Student的类，继承自Person类，并添加以下属性：学号（studentId）和成绩（score）。
         为Student类编写构造方法，用于初始化属性值。
         为Student类编写getter和setter方法，用于获取和设置属性值。
         定义一个名为Main的类，编写一个方法用于创建并打印Student对象的信息。
         要求：

         使用面向对象编程思想进行设计。
         使用注释说明代码的作用和功能。
         按照要求实现以上功能。*/