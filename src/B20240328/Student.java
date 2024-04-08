package B20240328;

public class Student {
    private String name;
    private String password;
    private long idCard;
    private long phoneNumber;

    public Student() {
    }

    public Student(String name, String password, long idCard, long phoneNumber) {
        this.name = name;
        this.password = password;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
