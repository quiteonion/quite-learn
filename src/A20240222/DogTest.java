package A20240222;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小七", 001 , "黑白相间的灰");
        Dog d = new Dog("老八", 002 , "五彩斑斓的黑");

        Dog[] arr = new Dog[]{dog,d};

        System.out.print(dog.name+"的编号是"+dog.id+",毛色是"+dog.color+",");dog.show();
        System.out.println();
        System.out.print(d.name+"的编号是"+d.id+",毛色是"+d.color+",");d.show();
    }
}
