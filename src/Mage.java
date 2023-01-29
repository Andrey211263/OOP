import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.DoublePredicate;

public class Mage extends Wizard{

    public Mage (NameCharacter name){
        super(String.valueOf(name), " Маг ",17,12, new int[]{-5,0},30, 9);
        this.mana = 1;
    }
    @Override
    public void step(ArrayList<BaseHero> heroylist) {
        ArrayList<Double> resHealt = new ArrayList<>();
        double min = 100;
        int minHeat = 0;
        int mini = 0;
        for (int i =0; i < heroylist.size(); i++){
            String[] her = heroylist.get(i).getInfo().split(" ");
            double tmp = Double.parseDouble(her[5]) / Double.parseDouble(her[6]) * 100;
            if (min > tmp){
                min = tmp;
                minHeat = Integer.parseInt(her[6]);
                mini = i;
            }
        }
//        Double min = Collections.min(resHealt);
        System.out.println(heroylist.get(mini)+"min="+min+" Mini "+mini);
        heroylist.get(mini).health=minHeat;
        System.out.println(heroylist.get(mini));

        }

    }
