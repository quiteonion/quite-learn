package A20240125;

import java.util.Random;

public class StudentSystem {
    public static void main(String[] args) {
        Random r = new Random();
        String []arr = {"林讯羽","李广健","张志壕","傅杨浩","朱翊涵","尧家乐","林宇煊","杨齐猛","林洋","廖俊丞","林聪炜","李嘉欢","王斌","王文尧","林星渝","王俊杰"};
        int radnom =r.nextInt(arr.length);
        System.out.println(arr[radnom]);
    }
}
