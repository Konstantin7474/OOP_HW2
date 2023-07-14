public class Spearman extends BaseHero {
    private int stamina;
    private int maxStamina;

    public Spearman(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Spearman #%d", ++Spearman.number),
                Spearman.r.nextInt(100, 200));
        this.maxStamina = Spearman.r.nextInt(50, 150);
        this.stamina = maxStamina;
    }
}
