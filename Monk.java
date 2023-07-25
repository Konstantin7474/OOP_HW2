public class Monk extends Medico {
    protected static int number = 0;

    public Monk(int qty, int x, int y) {
        super(qty,
                x,
                y,
                ++Monk.number,
                Skills.Monk.NAME,
                Skills.Monk.MAX_HP,
                Skills.Monk.ATTACK,
                Skills.Monk.DEFENCE,
                Skills.Monk.MIN_DAMAGE,
                Skills.Monk.MAX_DAMAGE,
                Skills.Monk.COST,
                Skills.Monk.IMITIATIVE,
                Skills.Monk.MAX_SHOOTS, Skills.Monk.HEALING);
    }
}