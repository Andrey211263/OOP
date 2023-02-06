package units;

import java.util.ArrayList;

public class Wizard extends BaseHero {
    protected int mana;
    public Wizard(String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(name, type, attack, defence, damage, health, speed, x, y);
        this.mana = mana;
    }

    @Override
    public String toString(){
//        return "Name: "+name+"Type: "+type+"Attack: "+attack+"Defence: "+defence+"Health: "+health+"Speed: "+speed+"Mana: "+mana;
        return super.toString()+" ,Mana: "+mana;
    }


    @Override
    public void step(ArrayList<BaseHero> heroylist) {
        float min = 100;
        int minHeat = 0;
        int mini = 0;

        for (int i =0; i < heroylist.size(); i++){

            float tmp = heroylist.get(i).health*100 / heroylist.get(i).maxhealt;
            if (min > tmp && tmp!=0 ){
                min = tmp;
                minHeat = heroylist.get(i).maxhealt;
                mini = i;
            }
        }

        heroylist.get(mini).health=minHeat; // восстанавливаем здоровье текущего персонажа
        System.out.println("*лечение*"+heroylist.get(mini).type+": "+ heroylist.get(mini).name+", до  = "+min+"%, "+
                ", после = "+heroylist.get(mini).health+" (100%)");
//                minHeat = Integer.parseInt(her[6]);

    }


}
