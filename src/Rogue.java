public class Rogue extends BaseHero{
    public Rogue(String name, int attack, int defence, int[] damage, int health, int speed) {
        super(name, attack, defence, damage, health, speed);
    }
    public Rogue(String name){
        super(name, 8,3, new int[] {2,4},10, 6);
    }
    @Override
    public String toString(){
//        return "Name: "+name+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed;
        return super.toString();
    }
}
