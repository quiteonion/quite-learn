package B20240402;

public class Book {
    public static void main(String[] args) {
        Books b = new Books();
        Books[] arr  ={new Books("万里柜台",50)};
        b.number();
    }
}

/**
 * .声明一个图书类，其数据成员为书名、编号（利用静态变量实现自动编号）、书价，
 * 并拥有静态数据成员册数，记录图书的总册数，
 * 在构造方法中利用此静态变量为对象的编号赋值，在主方法中定义多个对象，并求出总册数。
 */
class Books {

    private String name;
    private int id = bookNumber;
    private static int bookNumber;
    private double money;

    static {
        bookNumber = 1000;
        bookNumber++;
    }

    public Books() {
    }

    public Books(String name, double money) {
        this.name = name;
        this.money = money;
    }


    public static int getBookNumber() {
        return bookNumber;
    }

    public static void setBookNumber(int bookNumber) {
        Books.bookNumber = bookNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void number(){
        System.out.println("有"+(bookNumber-1000));
    }
}