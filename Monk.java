public class Monk extends BaseHero {
    private int prayer;
    private int maxPrayer;

    private int speed;
    private int maxSpeed;

    private int xCor;
    private int yCor;


    public Monk(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(100, 200));
        this.maxPrayer = Monk.r.nextInt(50, 150);
        this.prayer = maxPrayer;

        this.maxSpeed = Monk.r.nextInt(0, 15);
        this.speed = maxSpeed;

        this.xCor = Monk.r.nextInt(0,150);
        this.yCor  = Monk.r.nextInt(0,150);

    }

    public String getInfo() {
        return String.format("%s  Prayer: %d Position: X%d, Y%d Speed: %d", super.getInfo(), this.prayer, this.xCor, this.yCor, this.speed);
    }

    public int getXCor() {
        return xCor;
    }

    public int getYCor() {
        return yCor;
    }

}