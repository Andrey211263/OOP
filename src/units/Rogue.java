package units;

import java.util.ArrayList;

public class Rogue extends BaseHero{
    public Rogue(String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(name, type, attack, defence, damage, health, speed, x, y);
    }
    public Rogue(NameCharacter name, ArrayList<BaseHero> gang, int x, int y){

        super(String.valueOf(name), "Разбойник ",8,3, new int[] {2,4},10, 6, x, y);
    }
    @Override
    public String toString(){
//        return "Name: "+name+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed;
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
