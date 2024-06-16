package B20240616;

public class Main {
    //错几个对几个
    public static void main(String[] args) {
        String all = "对错对错错错对对对错对错对错对对错对错错对错对对错错对错错错错错对错错错错对错对错错错对对对对对错对对错对对对对对错对错错对错错对对错错对对错错错错对错对错错对错错对对对错对对错错错对错对对对错错错对对对对错对对对对错错错错错对错错对对对错错对对对对错对对错对对对对对错对对错错对对错错对错错对对错对对对对对错错错对错对";
        int j = 0;
        for (int i = 0; i < all.length()-1; i++) {
            if (all.charAt(i) == '对'){
                j++;
                if (all.charAt(i+1) != '对'){
                    System.out.println(j);
                    j = 0;
                }
            }else if (all.charAt(i) == '错'){
                j++;
                if (all.charAt(i+1) != '错'){
                    System.out.println(j);
                    j = 0;
                }
            }
        }
    }
}
