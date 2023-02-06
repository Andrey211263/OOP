package units;

import java.util.ArrayList;

public class Crossbowman extends Archer{
//    int shoots;
//    public Crossbowman(String name,  int attack, int defence, int[] damage, int health, int speed) {
//        super(name, attack, defence, damage, health, speed);
//        this.shoots = shoots;
//    }
    public Crossbowman (NameCharacter name, ArrayList<BaseHero> gang, int x, int y){
        super(String.valueOf(name), "Арбалетчик ",6,3, new int[]{4,6},10, 4, x, y);
        this.shoots = 16;
    }

}
