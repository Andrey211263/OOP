public class Archer extends BaseHero{
    int shoots;
    public Archer(String name, int attack, int defence, int[] damage, int health, int speed) {
        super(name, attack, defence, damage, health, speed);
        this.shoots = shoots;
    }

    @Override
    public String toString(){
//        return "Name: "+name+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed+"Shoots: "+shoots;
        return super.toString()+" ,Shoots: "+shoots;
    }
}
