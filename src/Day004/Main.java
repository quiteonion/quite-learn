package Day004;

import java.util.Random;
import java.util.Scanner;

/*射击判定: 游戏使用左轮枪作为武器。左轮枪最多有6发子弹，包括实弹和虚弹。每回合开始时，判定本回合总共有几颗子弹（可以是1-6发）。
        摇色子: 使用色子来决定谁先进行开枪。例如，抛出2点，3点或4点，玩家A先开枪；抛出5点或6点，玩家B先开枪。
        猜测目标: 开枪者需要猜测射击的目标（自己或对方）。如果选择射击自己，则当前回合不能移动或攻击；如果选择射击对方，则需要命中对方才能造成伤害。
        伤害判定: 实弹可以造成伤害，虚弹不会造成伤害。射击者猜测目标后，如果被射击者是活着的角色，会进行伤害判定。若射击者射中对方，则根据子弹类型（实弹或虚弹）决定是否造成伤害。
        结束回合: 当一轮射击结束后，回合结束，轮到下一位玩家进行回合。当某一方生命值降到0或以下时，游戏结束，另一方获胜。*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Character c = new Character();
        Enemy0 e = new Enemy0(5);
        YourName(c);

        /*//定义一把枪
        int[] revolver = new int[6];
        //判断枪里面有几颗子弹
        int rmmo_number = r.nextInt(5)+1;*/
        //使用致死数字法
        int number = r.nextInt(10);
        //其中有一个数字是致死数字


        //摇色子决定谁先进行开枪，开枪者可以猜测对谁进行射击（自己或者对方）
        System.out.println("好的，让我们看看谁先开枪！");
        int dice = r.nextInt(2);
        if (dice == 1){
            System.out.printf("很好，是你的一个好机会。(你先开枪)");
            //定义血量为 3 ；
            c.setBoold(3);
            System.out.println("你要为对方开枪还是自己开枪（1 -- 对方 、 0 -- 自己）");
            int go_to = sc.nextInt();
            //判断对自己开枪还是对对方开枪
            //先判断自己的血量是否健康
            if (go_to == 1){


            } else if (go_to == 0) {

            }else{
                System.out.println("很可惜你违背了我们的约定，现在由对方开枪");
                dice = 0;
            }
        }if (dice == 0){
            System.out.println("真是不太走运，听说他杀人不眨眼！(对方先开枪)");
        }
        //如果随机到0就机器人开枪，如果随机到1就主角开枪
    }
    public static Character YourName(Character c){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字吧，赌徒。");
        String name = sc.next();
        c.setName(name);
        System.out.println("很好，赌徒，祝你好运！");
        return c;
    }
    public static int
}
