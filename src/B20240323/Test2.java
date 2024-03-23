package B20240323;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        Cat c = new Cat();
        Person p = new Person();
        Animo a = new Animo();

//        Student ss = (Student) p;
//        Cat cc = (Cat) a;

        /**
         * 以下的部分错误，原因是因为 ， Cat类 并不是 p(Person) 的子类
         * 以下的部分错误，原因是因为 ， Student类 并不是 a(Animo) 的子类
         */
        //Cat sss = (Cat) p;
        //Student ccc = (Student) a;

       /* if (a instanceof Cat){
            System.out.println("true");
        }else if (c instanceof Animo){
            System.out.println("true -- 1");
        }*/ /*else if (c instanceof a) {
            System.out.println();
        }*/

    }
}

class Person {
    public void a() {
        System.out.println("111");
    }
}

class Student extends Person {
    public void b (){
        System.out.println("222");
    }
}

class Animo {
    public void a() {
        System.out.println("333");
    }
}

class Cat extends Animo {
    public void b (){
        System.out.println("444");
    }
}

