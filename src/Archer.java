import java.util.ArrayList;

public class Archer extends BaseHero{
    int shoots;
    public Archer(String name, String type, int attack, int defence, int[] damage, int health, int speed) {
        super(name, type, attack, defence, damage, health, speed);
        this.shoots = shoots;
    }

    @Override
    public String toString(){
//        return "Name: "+name+"Type: "+type+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed+"Shoots: "+shoots;
        return super.toString()+" ,Shoots: "+shoots;
    }


    @Override
    public void step(ArrayList<BaseHero> heroylist) {

    }

//    @Override
//    public String getInfo() {
//        return null;
//    }
}
