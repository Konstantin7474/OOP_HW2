public class Sniper extends BaseHero {
    private int accuracy;
    private int maxAccuracy;

    private int speed;
    private int maxSpeed;

    private int xCor;
    private int yCor;


    public Sniper(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Sniper #%d", ++Sniper.number),
                Sniper.r.nextInt(100, 200));
        this.maxAccuracy = Sniper.r.nextInt(50, 150);
        this.accuracy = maxAccuracy;

        this.maxSpeed = Sniper.r.nextInt(0, 15);
        this.speed = maxSpeed;

        this.xCor = Sniper.r.nextInt(0,150);
        this.yCor  = Sniper.r.nextInt(0,150);

    }

    public String getInfo() {
        return String.format("%s  Accuracy: %d Position: X%d, Y%d Speed: %d", super.getInfo(), this.accuracy, this.xCor, this.yCor, this.speed);
    }

    public int getXCor() {
        return xCor;
    }


    public int getYCor() {
        return yCor;
    }

}
