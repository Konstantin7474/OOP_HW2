public class Peasant extends BaseHero {
    private int work;
    private int maxWork;

    private int xCor;
    private int yCor;


    public Peasant(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Peasant #%d", ++Peasant.number),
                Peasant.r.nextInt(100, 200));
        this.maxWork = Peasant.r.nextInt(50, 150);
        this.work = maxWork;

        this.xCor = Peasant.r.nextInt(0,150);
        this.yCor  = Peasant.r.nextInt(0,150);

    }

    public String getInfo() {
        return String.format("%s  Work: %d Position: X%d, Y%d", super.getInfo(), this.work, this.xCor, this.yCor);
    }

    public int getXCor() {
        return xCor;
    }


    public int getYCor() {
        return yCor;
    }

}
