public class Crossbowman extends BaseHero {
    private int accuracy;
    private int maxAccuracy;

    public Crossbowman(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number),
                Crossbowman.r.nextInt(100, 200));
        this.maxAccuracy = Monk.r.nextInt(50, 150);
        this.accuracy = maxAccuracy;
    }
}