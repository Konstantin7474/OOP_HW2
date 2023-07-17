public class Farmer extends BaseHero {
    private int work;
    private int maxWork;

    private int xCor;
    private int yCor;

    public Farmer() {
        super(String.format("Hero_Farmer #%d", ++Farmer.number),
                Peasant.r.nextInt(100, 200));
        this.maxWork = Peasant.r.nextInt(50, 150);
        this.work = maxWork;

        this.xCor = Farmer.r.nextInt(0,150);
        this.yCor  = Farmer.r.nextInt(0,150);
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
