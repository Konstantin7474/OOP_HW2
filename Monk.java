public class Monk extends BaseHero {
    private int prayer;
    private int maxPrayer;

    public Monk(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(100, 200));
        this.maxPrayer = Monk.r.nextInt(50, 150);
        this.prayer = maxPrayer;
    }
}