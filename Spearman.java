public class Spearman extends Walkers {
    protected static int number = 0;

    public Spearman(int qty, int x, int y) {
        super(qty,
                x,
                y,
                ++Spearman.number,
                Skills.Spearman.NAME,
                Skills.Spearman.MAX_HP,
                Skills.Spearman.ATTACK,
                Skills.Spearman.DEFENCE,
                Skills.Spearman.MIN_DAMAGE,
                Skills.Spearman.MAX_DAMAGE,
                Skills.Spearman.COST,
                Skills.Spearman.IMITIATIVE);
    }
}