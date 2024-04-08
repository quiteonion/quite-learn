package B20240328;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private int id;
    private String gender;


    private double mathGrades;
    private double chineseGrades;
    private double englishGrades;
    private static int i;

    static {
        i = 0;
    }

    public Student() {
        i++;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getId() {
        return i;
    }


    public double getMathGrades() {
        return mathGrades;
    }


    public void setMathGrades(double mathGrades) {
        this.mathGrades = mathGrades;
    }


    public double getChineseGrades() {
        return chineseGrades;
    }


    public void setChineseGrades(double chineseGrades) {
        this.chineseGrades = chineseGrades;
    }


    public double getEnglishGrades() {
        return englishGrades;
    }


    public void setEnglishGrades(double englishGrades) {
        this.englishGrades = englishGrades;
    }


    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

}
