package A20240417.River;

import java.util.Scanner;

public class Test {
    static Animal sheep = new Sheep("羊");
    static Animal whlf = new Wolf("狼");
    static Animal grass = new Grass("草");
    static final Animal[] shipArr = new Animal[2];
    static final Animal[] shoreArr = new Animal[3];
    static final Animal[] thitherArr = new Animal[3];
    static {
        shoreArr[0] = sheep;
        shoreArr[1] = whlf;
        shoreArr[2] = grass;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            int number = sc.nextInt();
            switch (number) {

            }
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
        System.out.println("有  羊  狼   草   上帝  这四个人物，岸边停靠（只能够上两个人的小船），上帝要通过船过河的话，应该怎么选择？");
        System.out.println("请开始您的选择");
        System.out.println("请行动");
        
    }
    public void forArr(){
        for (int i = 0; i < shoreArr.length; i++) {
            
        }
    }
}
