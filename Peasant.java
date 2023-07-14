public class Peasant extends BaseHero {
    private int work;
    private int maxWork;

    public Peasant(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Peasant #%d", ++Peasant.number),
                Peasant.r.nextInt(100, 200));
        this.maxWork = Peasant.r.nextInt(50, 150);
        this.work = maxWork;
    }

}