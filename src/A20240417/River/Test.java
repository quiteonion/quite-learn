package A20240417.River;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static Animal person = new Animal("农夫");
    static Animal sheep = new Sheep("羊");
    static Animal whlf = new Wolf("狼");
    static Animal grass = new Grass("草");
    static Animal[] arr = {person, sheep, whlf, grass};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        while (true) {
            addloc();
            around();
            System.out.println("已送达，您现在在对岸");
            if (whlf.getLocation() == 1 && sheep.getLocation() == 1 && grass.getLocation() == 1) {
                System.out.println("您成功了！游戏结束");
                System.exit(0);
            }
            deleteloc();
            around();
        }
    }


    private static void menu() {
        System.out.println("游戏开始，");
        System.out.println("场景如下");
        System.out.println("============================");
        System.out.println("                             ");
        System.out.println("-----------------------------");
        System.out.println("       -    -      -       - ");
        System.out.println("- -   🚢-   -  -    -   -    -");
        System.out.println("-----------------------------");
        System.out.println("   🐏    🐺    🌿    🧔🏼     ");
        System.out.println("============================");
        System.out.println("有  1.羊  2.狼   3.草   4.农夫  这四个人物，岸边停靠（只能够上两个人的小船），农夫要通过船过河的话，应该怎么选择？");
        System.out.println("请行动");

    }

    public static void addloc() {
        System.out.println("请选择一个生物送去对岸");
        while (true) {
            System.out.println("1、狼  2、羊  3、草  4、不选择");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    if (ANbian(whlf)){
                        whlf.addLocation();
                        person.addLocation();
                        return;
                    }
                    System.out.println("选择错误，该生物已经不能离开岸边，请重新选择");
                    break;
                case 2:
                    if (ANbian(sheep)){
                        sheep.addLocation();
                        person.addLocation();
                        return;
                    }
                    System.out.println("选择错误，该生物已经不能离开岸边，请重新选择");
                    break;
                case 3:
                    if (ANbian(grass)){
                        grass.addLocation();
                        person.addLocation();
                        return;
                    }
                    System.out.println("选择错误，该生物已经不能离开岸边，请重新选择");
                    break;
                case 4:
                    person.addLocation();
                    return;
                default:
                    System.out.println("您的选择有误 , 请重新选择");
                    break;
            }
        }
    }

    public static void deleteloc() {
        System.out.println("请选择一个生物送回岸");
        while (true) {
            System.out.println("1、狼  2、羊  3、草  4、不选择");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    if (DUIANbian(whlf)){
                        whlf.deleteLocation();
                        person.deleteLocation();
                        return;
                    }
                    System.out.println("选择错误，该生物已经不能离开对岸边，请重新选择");
                    break;
                case 2:
                    if (DUIANbian(sheep)){
                        sheep.deleteLocation();
                        person.deleteLocation();
                        return;
                    }
                    System.out.println("选择错误，该生物已经不能离开对岸边，请重新选择");
                    break;
                case 3:
                    if (DUIANbian(grass)){
                        grass.deleteLocation();
                        person.deleteLocation();
                        return;
                    }
                    System.out.println("选择错误，该生物已经不能离开对岸边，请重新选择");
                    break;
                case 4:
                    person.deleteLocation();
                    return;
                default:
                    System.out.println("您的选择有误 , 请重新选择");
                    break;
            }
        }
    }

    public static void around() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[1].getLocation() == arr[2].getLocation() && arr[0].getLocation() != arr[1].getLocation()) {
                System.out.println("羊被狼吃掉了!游戏结束");
                System.exit(0);
            } else if (arr[1].getLocation() == arr[3].getLocation() && arr[0].getLocation() != arr[1].getLocation()) {
                System.out.println("草被羊吃掉了!游戏结束");
                System.exit(0);
            }
        }
    }

    public static boolean ANbian(Animal animal) {
        if (animal.getLocation() == 0) {
            return true;
        }
        return false;
    }

    public static boolean DUIANbian(Animal animal) {
        if (animal.getLocation() == 1) {
            return true;
        }
        return false;
    }
}