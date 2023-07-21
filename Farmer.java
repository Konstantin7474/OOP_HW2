public class Farmer extends BaseHero {
    private int work;
    private int maxWork;

    private int speed;
    private int maxSpeed;

    private int xCor;

    private int yCor;

    public Farmer(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Farmer #%d", ++Farmer.number),
                Farmer.r.nextInt(100, 200));
        this.maxWork = Farmer.r.nextInt(50, 150);
        this.work = maxWork;

        this.maxSpeed = Farmer.r.nextInt(0, 15);
        this.speed = maxSpeed;

        this.xCor = Farmer.r.nextInt(0,150);
        this.yCor  = Farmer.r.nextInt(0,150);

    }

    public String getInfo() {
        return String.format("%s  Work: %d Position: X%d, Y%d Speed: %d", super.getInfo(), this.work, this.xCor, this.yCor, this.speed);
    }

    public int getXCor() {
        return xCor;
    }

    public int getYCor() {
        return yCor;
    }


}