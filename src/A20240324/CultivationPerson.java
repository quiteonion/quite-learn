package A20240324;

public class CultivationPerson {
    public static void main(String[] args) {
        /*CultivationAnimal CA = new CultivationAnimal();
        CultivationCat CC = new CultivationCat();
        CC.getCat();
        System.out.println("养了"+CC.adopted());*/
        CultivationAnimal CA = new CultivationAnimal();
        CA.adopted();
    }
}

class Animal {
    String[] name = {"Dog", "Cat"};


}

class CultivationAnimal extends Animal {
    public void adopted() {
        for (int i = 0; i < name.length; i++) {
            System.out.println("养了" + name[i]);
        }
    }
}
/*
class CultivationCat extends CultivationAnimal {
    public void getCat() {
        super.name = "Cat";
    }
}

class CultivationDog extends CultivationAnimal {
    public void getDog() {
        super.name = "Dog";
    }
}
*/
/*
class CultivationAnimal {
    String name;

    public String adopted() {
        return this.name;
    }
}
*/
