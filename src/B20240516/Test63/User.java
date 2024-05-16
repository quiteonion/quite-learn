package B20240516.Test63;

public class User {
    private String name;
    private String password;
    private String birthday;
    private long phone;
    private String emil;

    public User() {
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

    public void setEmil(String emil) {
        this.emil = emil;
    }

    @Override
    public String toString() {
        return this.name + " " + this.password + " " + this.birthday + " " + this.phone;
    }
}
