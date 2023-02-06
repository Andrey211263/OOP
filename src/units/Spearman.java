package units;

import java.util.ArrayList;

public class Spearman extends BaseHero{
    public Spearman(String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(name, type, attack, defence, damage, health, speed, x, y);
    }
    public Spearman (NameCharacter name, ArrayList<BaseHero> gang, int x, int y){

        super(String.valueOf(name), "Копейщик ",4,5, new int[]{1,3},10, 4, x, y);
    }
    @Override
    public String toString(){
//        return "Name: "+name+"Type: "+type+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed;
        return super.toString();
    }


    @Override
    public void step(ArrayList<BaseHero> heroylist) {

    }

//    @Override
//    public String getInfo() {
//        return null;
//    }
}
