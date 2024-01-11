package Day004;

public class Revolver {
    private final int[] ammo;
    //枪是左轮，最多只有 6 发子弹 ， 每回合都进行判定 判定本回合总共有几颗子弹 ，子弹中分实弹和虚弹


    public Revolver(int[] ammo){
        this.ammo = ammo;
    }
    public Revolver(int ammo){
        this.ammo = new int[]{ammo};
    }

    public void setAmmo(){
        this.ammo = new int[];
    }
    public int getAmmo(){
        return ammo[6];
    }
}
