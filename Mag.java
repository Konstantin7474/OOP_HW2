public class Mag extends Medico {
    protected static int number = 0;

    public Mag(int qty, int x, int y) {
        super(qty,
                x,
                y,
                ++Mag.number,
                Skills.Mag.NAME,
                Skills.Mag.MAX_HP,
                Skills.Mag.ATTACK,
                Skills.Mag.DEFENCE,
                Skills.Mag.MIN_DAMAGE,
                Skills.Mag.MAX_DAMAGE,
                Skills.Mag.COST,
                Skills.Mag.IMITIATIVE,
                Skills.Mag.MAX_SHOOTS, Skills.Mag.HEALING);
    }
}