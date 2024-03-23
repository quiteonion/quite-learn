package B20240323;

class Parent {
    public void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("Child method");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child(); // 隐式类型转换（向上转型）
        Child p0 = new Child();
        Parent pp = (Parent)p0;
        p.parentMethod(); // 输出 "Parent method"
// p.childMethod(); // 这行会编译错误，因为p被视为Parent类型，没有childMethod方法
    }
}