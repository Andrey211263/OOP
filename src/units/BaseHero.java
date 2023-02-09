package units;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements BaseInterface {
    protected String name, type;
    protected Integer attack, defence, speed, maxhealt, x, y;
    protected float health;
    protected int[] damage;
    protected Vector2 position;

    public BaseHero(String name, String type, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        this.position = new Vector2(x,y);
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxhealt = health;
//        this.health = maxhealt - new Random().nextInt(maxhealt);
        this.health = maxhealt;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Name: "+name+"Type"+type+" Attack: "+attack+" Defence: "+defence+" Damage: "+ Arrays.toString(damage)
                +" Health: "+health+" Speed: "+speed+ " x:"+x+" y:"+y;
    }

//    @Override
    public void step(ArrayList<BaseHero> heroylist) {

    }

    public Vector2 getPosition(){
        return position;
    }

    public float healthColor(int i) {
        return health;
    }

    public String getName(){
        return type;
    }
    public String getInfo() {
        return type + " " + name + " Здоровье: "+"\uD83E\uDDE1"+ String.valueOf(health)+" "+String.valueOf(maxhealt)+ " ⚔️"+ attack;
    }
    public void getDamage(float attackPower){
        this.health -= attackPower;
        if (this.health < 0){
            this.health = 0;
        }
        else if (this.health > maxhealt){
            this.health = maxhealt;
        }

    }
//    @Override
//    public String getInfo() {
//        return String.format("%-10s %-13s %s Осталось здоровья: %-2d из %-2d %s:%-2d", name, type, "\uD83E\uDDE1", String.valueOf(health), String.valueOf(maxhealt), " ⚔️", attack);}
//

}

