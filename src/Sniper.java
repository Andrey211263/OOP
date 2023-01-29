public class Sniper extends Archer{
//    int shoots;
//    public Sniper(String name, int attack, int defence, int[] damage, int health, int speed) {
//        super(name, attack, defence, damage, health, speed);
//        this.shoots = shoots;
//    }
    public Sniper (NameCharacter name){
        super(String.valueOf(name), " Лучник ",12,10, new int[]{8,10},15, 9);
        this.shoots = 32;
    }
//    @Override
//    public String toString(){
////        return "Name: "+name+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed+"Shoots: "+shoots;
//        return super.toString()+" ,Shoots: "+shoots;
//    }
}
