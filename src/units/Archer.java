package units;

import java.util.ArrayList;

public class Archer extends BaseHero {
    protected int shoots;
    public Archer(String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(name, type, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
    }

    @Override
    public String toString(){
//        return "Name: "+name+"Type: "+type+"Attack: "+attack+"Defence: "+defence+"Damage: "+damage+"Health: "+health+"Speed: "+speed+"Shoots: "+shoots;
        return super.toString()+" ,Shoots: "+shoots;
    }


    @Override
    public void step(ArrayList<BaseHero> heroylist) {
        if (this.health >0){ // Атакуем если здоровье не = 0
        Vector2 target = minDistance(heroylist);
// просчитываем коэфицинт уронна от дистанции <= 4 урон 100%, = 12 = 0
        float attackPower = 0;
        if (target.y < 4){
            attackPower = damage[1];}
        else {
            attackPower = damage[0] + (target.y - 4)/8*(damage[1] - damage[0]);
        }

        int signShot = 0; // признак сделан выстрел или нет
        for(int i = 0; i < heroylist.size(); i++) {
            if (heroylist.get(i).health > 0){ // проверка на 0 здоровья
                if (heroylist.get(i).type.equals("Фермер ")) {
                if (((Farmer) heroylist.get(i)).supply > 0) {
                    heroylist.get((int)target.x).getDamage(attackPower);
                    System.out.println("->"+this.name+" "+this.type+" делает выстрел в игрока " + heroylist.get((int)target.x).name+" "
                            +heroylist.get((int)target.x).type+" остаток стрел: "+this.shoots+" нанесенный ущерб "+attackPower);
                    ((Farmer) heroylist.get(i)).supply = 0;
                    signShot = 1;
                    break;
                }
            }
            }
        }
        if(signShot==0){
            if(shoots > 0){
            shoots--;
            heroylist.get((int)target.x).getDamage(attackPower);
            System.out.println("->"+this.name+" "+this.type+" делает выстрел в игрока " +heroylist.get((int)target.x).name+" "
                    +heroylist.get((int)target.x).type+" остаток стрел: "+this.shoots+" нанесенный ущерб "+attackPower);
            }
            else {
                System.out.println("**Лучник "+this.name+" закончились стрелы!**");
            }
        }}
    }
    private Vector2 minDistance(ArrayList<BaseHero>heroylist){
        float temp = 0;
        int minindex= 0;
        float mindistance = heroylist.get(0).getPosition().getDistance(x,y);
        for(int i = 1; i < heroylist.size(); i++ ){

            if(heroylist.get(i).health > 0){ // проверка на 0 здоровья
            temp = heroylist.get(i).getPosition().getDistance(x, y);
//            System.out.println("distance "+temp);
            if (mindistance > temp){
                mindistance = temp;
                minindex = i;
                }
            }

        }
        return new Vector2(minindex, mindistance);
    }
}
