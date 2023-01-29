import java.util.ArrayList;

public class Farmer extends BaseHero {
    int supply;

    public Farmer(String name, String type, int attack, int defence, int[] damage, int health, int speed, int supply) {
        super(name, type, attack, defence, damage, health, speed);
        this.supply = supply;
    }
    public Farmer(NameCharacter name){
        super(String.valueOf(name), " Фермер ",1,1, new int[] {1,1},1, 3);
        this.supply = 1;
    }


    @Override
    public String toString() {
//        return "Name: "+name+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed+"Supply "+supply;
        return super.toString()+" ,Supply "+supply;
    }



//    @Override
//    public void step() {
//
//    }
//
//    @Override
//    public void step(ArrayList<BaseHero> heroylist) {
//
//    }

//    @Override
//    public String getInfo() {
//        return null;
//    }
}