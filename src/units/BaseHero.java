package units;

import units.BaseInterface;

import java.util.*;

public abstract class BaseHero implements BaseInterface {
    protected String name, type;
    protected Integer attack, defence, health, speed, maxhealt;
    protected int[] damage;

    public BaseHero(String name, String type, int attack, int defence, int[] damage, int health, int speed) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxhealt = health;
        this.health = maxhealt - new Random().nextInt(maxhealt);
        this.speed = speed;
    }
    @Override
    public String toString(){
        return "Name: "+name+"Type"+type+" Attack: "+attack+" Defence: "+defence+" Damage: "+ Arrays.toString(damage) +" Health: "+health+" Speed: "+speed;
    }

//    @Override
    public void step(ArrayList<BaseHero> heroylist) {

    }

//    @Override
    public String getInfo() {
        return type + " " + name + " Здоровье: " + String.valueOf(health)+" "+String.valueOf(maxhealt);
//        return type + " " + name + ". Здоровье: " + health+" , "+maxhealt;
    }

}

