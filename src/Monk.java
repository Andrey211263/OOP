import java.util.ArrayList;

public class Monk extends Wizard {

    public Monk(NameCharacter name) {
        super(String.valueOf(name), " Монах ",12, 7, new int[]{-4, 0}, 30, 5);
        this.mana = 1;
    }
//    @Override
//    public void step(ArrayList<BaseHero> heroylist) {
//
//    }

//    @Override
//    public String getInfo() {
//        return super.toString();
//    }
}
