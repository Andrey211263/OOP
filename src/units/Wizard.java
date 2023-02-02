package units;

import java.util.ArrayList;
import java.util.Collections;

public class Wizard extends BaseHero {
    protected int mana;
    public Wizard(String name, String type, int attack, int defence, int[] damage, int health, int speed) {
        super(name, type, attack, defence, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString(){
//        return "Name: "+name+"Type: "+type+"Attack: "+attack+"Defence: "+defence+"Health: "+health+"Speed: "+speed+"Mana: "+mana;
        return super.toString()+" ,Mana: "+mana;
    }


//    @Override
//    public void step(ArrayList<BaseHero> heroylist) {
//        ArrayList<Double> resHealt = new ArrayList<>();
//        for(BaseHero param: heroylist){
//            String[] her = param.getInfo().split(" ");
//            resHealt.add((Double.parseDouble(her[3]) / Double.parseDouble(her[4])*100));
//        }
////        int min = Collections.min(resHealt);
////        System.out.println(min);
//        System.out.println("Привет доктор!");
//
//    }


}
