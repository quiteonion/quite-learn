package A20240222;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小七", 001 , "黑白相间的灰");
        Dog d = new Dog();
        d.setName("老八");
        d.setId(002);
        d.setColor("五彩斑斓的黑");
        Dog[] arr = new Dog[]{dog,d};

        System.out.print(dog.getName()+"的编号是"+dog.getId()+",毛色是"+dog.getColor()+",");dog.show();
        System.out.println();
        System.out.print(d.getName()+"的编号是"+d.getId()+",毛色是"+d.getColor()+",");d.show();
    }
}
