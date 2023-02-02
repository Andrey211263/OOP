package units;

import java.util.ArrayList;

public class Archer extends BaseHero {
    protected int shoots;
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
        int signShot = 0; // признак сделан выстрел или нет

        for(int i = 0; i < heroylist.size(); i++) {
            if (heroylist.get(i).type.equals(" Фермер ")) {
                if (((Farmer) heroylist.get(i)).supply > 0) {
                    System.out.println("->"+this.name+" делает выстрел,"+" остаток стрел: "+this.shoots);
                    ((Farmer) heroylist.get(i)).supply = 0;
                    signShot = 1;
                    break;
                }
            }
        }
        if(signShot==0){
            if(shoots > 0){
            shoots--;
            System.out.println("->"+this.name+" делает выстрел,"+" остаток стрел: "+this.shoots);
            }
            else {
                System.out.println("**Лучник "+this.name+" закончились стрелы!**");
            }
        }
    }
}
