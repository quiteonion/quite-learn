package B20240613.Bank;

public class User {
    //用户 姓名、 年龄、 存有的钱数、 借款钱数、 账号、 密码
    private String name;
    private char gender;
    private int age;
    private long moneyNumber;
    private long account;
    private String password;

    public User(String name, char gender, int age, long moneyNumber, long account, String password) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.moneyNumber = moneyNumber;
        this.account = account;
        this.password = password;
    }

}
