package units;

import java.util.ArrayList;

public class Monk extends Wizard {

    public Monk(NameCharacter name, ArrayList<BaseHero> gang, int x, int y) {
        super(String.valueOf(name), "Монах ",12, 7, new int[]{-4, 0}, 30, 5, x, y);
        this.mana = 1;
    }
//    @Override
//    public void step(ArrayList<BaseHero> heroylist) {
//
//    }

//    @Override
//    public String getInfo() {
//        return super.toString();
//    }
}
