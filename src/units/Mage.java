package units;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.DoublePredicate;

public class Mage extends Wizard {

    public Mage (NameCharacter name){
        super(String.valueOf(name), " Маг ",17,12, new int[]{-5,0},30, 9);
        this.mana = 1;
    }
    @Override
    public void step(ArrayList<BaseHero> heroylist) {
        int min = 100;
        int minHeat = 0;
        int mini = 0;

        for (int i =0; i < heroylist.size(); i++){

            int tmp = heroylist.get(i).health*100 / heroylist.get(i).maxhealt;
            if (min > tmp){
                min = tmp;
                minHeat = heroylist.get(i).maxhealt;
                mini = i;
            }
        }


        heroylist.get(mini).health=minHeat; // восстанавливаем здоровье текущего персонажа
        System.out.println("*лечение*"+heroylist.get(mini).type+": "+ heroylist.get(mini).name+", до  = "+min+"%, "+
                ", после = "+heroylist.get(mini).health+" -> 100%");
//                minHeat = Integer.parseInt(her[6]);

        }

    }
