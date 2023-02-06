package units;

import java.util.ArrayList;

public class Mage extends Wizard {

    public Mage (NameCharacter name, ArrayList<BaseHero> gang, int x, int y){
        super(String.valueOf(name), "Маг ",17,12, new int[]{-5,0},30, 9, x, y);
        this.mana = 1;
        }
    }
