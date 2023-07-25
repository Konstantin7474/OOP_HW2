public class Rubber extends BaseHero {
    protected static int number = 0;

    public Rubber(int qty, int x, int y) {
        super(qty,
                x,
                y,
                ++Rubber.number,
                Skills.Rubber.NAME,
                Skills.Rubber.MAX_HP,
                Skills.Rubber.ATTACK,
                Skills.Rubber.DEFENCE,
                Skills.Rubber.MIN_DAMAGE,
                Skills.Rubber.MAX_DAMAGE,
                Skills.Rubber.COST,
                Skills.Rubber.IMITIATIVE);
    }
}
