package units;

import java.util.ArrayList;

public class Spearman extends BaseHero{
    public Spearman(String name, String type, int attack, int defence, int[] damage, int health, int speed) {
        super(name, type, attack, defence, damage, health, speed);
    }
    public Spearman (NameCharacter name){
        super(String.valueOf(name), " Копейщик ",4,5, new int[]{1,3},10, 4);
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
