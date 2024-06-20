package B20240613.Bank;

public class User {
    //用户 姓名、 年龄、 存有的钱数、 借款钱数、 账号、 密码
    private String name;
    private int age;
    private long account;
    private String password;
    private long moneyNumber;

    public User(String name, int age, long account, String password, long moneyNumber) {
        this.name = name;
        this.age = age;
        this.account = account;
        this.password = password;
        this.moneyNumber = moneyNumber;
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

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMoneyNumber() {
        return moneyNumber;
    }

    public void setMoneyNumber(long moneyNumber) {
        this.moneyNumber = moneyNumber;
    }
}
