public class Bowman extends Shooter {
    protected static int number = 0;

    public Bowman(int qty, int x, int y) {
        super(qty,
                x,
                y,
                ++Bowman.number,
                Skills.Bowman.NAME,
                Skills.Bowman.MAX_HP,
                Skills.Bowman.ATTACK,
                Skills.Bowman.DEFENCE,
                Skills.Bowman.MIN_DAMAGE,
                Skills.Bowman.MAX_DAMAGE,
                Skills.Bowman.COST,
                Skills.Bowman.IMITIATIVE,
                Skills.Bowman.MAX_SHOOTS);
    }
}