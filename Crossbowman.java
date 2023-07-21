public class Crossbowman extends BaseHero {
    private int accuracy;
    private int maxAccuracy;

    private int speed;
    private int maxSpeed;

    private int xCor;
    private int yCor;


    public Crossbowman(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number),
                Crossbowman.r.nextInt(100, 200));
        this.maxAccuracy = Crossbowman.r.nextInt(50, 150);
        this.accuracy = maxAccuracy;

        this.maxSpeed = Crossbowman.r.nextInt(0, 15);
        this.speed = maxSpeed;

        this.xCor = Crossbowman.r.nextInt(0,150);
        this.yCor  = Crossbowman.r.nextInt(0,150);

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
