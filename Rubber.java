public class Rubber extends BaseHero {
    private int secrecy;
    private int maxSecrecy;

    public Rubber(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Rubber #%d", ++Rubber.number),
                Rubber.r.nextInt(100, 200));
        this.maxSecrecy = Rubber.r.nextInt(50, 150);
        this.secrecy = maxSecrecy;
    }
}