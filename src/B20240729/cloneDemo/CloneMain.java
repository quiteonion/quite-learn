package B20240729.cloneDemo;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        User user1 = new User("tom", 18, arr);
        User user2 = user1.clone();
        System.out.println(user1);
        System.out.println("=== === ====");
        System.out.println(user2);
    }
}
