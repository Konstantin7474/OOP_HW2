public class Monk extends BaseHero {
    private int prayer;
    private int maxPrayer;

    private int xCor;
    private int yCor;

    public Monk() {
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(100, 200));
        this.maxPrayer = Monk.r.nextInt(50, 150);
        this.prayer = maxPrayer;

        this.xCor = Monk.r.nextInt(0,150);
        this.yCor  = Monk.r.nextInt(0,150);
    }

    public String getInfo() {
        return String.format("%s  Prayer: %d Position: X%d, Y%d", super.getInfo(), this.prayer, this.xCor, this.yCor);
    }

    public int getXCor() {
        return xCor;
    }

    public int getYCor() {
        return yCor;
    }

}
