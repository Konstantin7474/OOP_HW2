import java.util.ArrayList;

public class Peasant extends BaseHero {
    protected static int number = 0;

    public Peasant(int qty, int x, int y) {
        super(qty,
                x,
                y,
                ++Peasant.number,
                Skills.Peasant.NAME,
                Skills.Peasant.MAX_HP,
                Skills.Peasant.ATTACK,
                Skills.Peasant.DEFENCE,
                Skills.Peasant.MIN_DAMAGE,
                Skills.Peasant.MAX_DAMAGE,
                Skills.Peasant.COST,
                Skills.Peasant.IMITIATIVE);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        if (hp <= 0) return;
        action = Actions.waiting;
    }
}