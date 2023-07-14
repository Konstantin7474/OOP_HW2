public class Sniper extends BaseHero {
    private int accuracy;
    private int maxAccuracy;

    public Sniper(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Sniper #%d", ++Sniper.number),
                Sniper.r.nextInt(100, 200));
        this.maxAccuracy = Sniper.r.nextInt(50, 150);
        this.accuracy = maxAccuracy;
    }
}