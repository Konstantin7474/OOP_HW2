public class Sniper extends Shooter {
    protected static int number = 0;

    public Sniper(int qty, int x, int y) {
        super(qty,
                x,
                y,
                ++Sniper.number,
                Skills.Sniper.NAME,
                Skills.Sniper.MAX_HP,
                Skills.Sniper.ATTACK,
                Skills.Sniper.DEFENCE,
                Skills.Sniper.MIN_DAMAGE,
                Skills.Sniper.MAX_DAMAGE,
                Skills.Sniper.COST,
                Skills.Sniper.IMITIATIVE,
                Skills.Sniper.MAX_SHOOTS);
    }
}
