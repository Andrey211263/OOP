package units;

public class Crossbowman extends Archer{
//    int shoots;
//    public Crossbowman(String name,  int attack, int defence, int[] damage, int health, int speed) {
//        super(name, attack, defence, damage, health, speed);
//        this.shoots = shoots;
//    }
    public Crossbowman (NameCharacter name){
        super(String.valueOf(name), " Арбалетчик ",6,3, new int[]{2,3},10, 4);
        this.shoots = 16;
    }

}
