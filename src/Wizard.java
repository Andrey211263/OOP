public class Wizard extends BaseHero {
    int mana;
    public Wizard(String name, int attack, int defence, int[] damage, int health, int speed) {
        super(name, attack, defence, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString(){
//        return "Name: "+name+"Attack: "+attack+"Defence: "+defence+"Health: "+health+"Speed: "+speed+"Mana: "+mana;
        return super.toString()+" ,Mana: "+mana;
    }
}
