package B20240516.Test63;

public class User {
    private String name;
    private String password;
    private String birthday;
    private long phone;

    public User() {
    }

    public User(String name, String password, String birthday, long phone) {
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.phone = phone;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.name + " " + this.password + " " + this.birthday + " " + this.phone;
    }
}
