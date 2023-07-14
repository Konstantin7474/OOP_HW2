public class Mag extends BaseHero {
    private int mana;
    private int maxMana;

    public Mag(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Mag #%d", ++Mag.number),
                Mag.r.nextInt(100, 200));
        this.maxMana = Mag.r.nextInt(50, 150);
        this.mana = maxMana;
    }
}