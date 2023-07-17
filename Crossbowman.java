public class Crossbowman extends BaseHero {
    private int accuracy;
    private int maxAccuracy;

    private int xCor;
    private int yCor;

    public Crossbowman() {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number),
                Crossbowman.r.nextInt(100, 200));
        this.maxAccuracy = Monk.r.nextInt(50, 150);
        this.accuracy = maxAccuracy;

        this.xCor = Crossbowman.r.nextInt(0,150);
        this.yCor  = Crossbowman.r.nextInt(0,150);

    }

    public String getInfo() {
        return String.format("%s  Accuracy: %d Position: X%d, Y%d", super.getInfo(), this.accuracy, this.xCor, this.yCor);
    }

    public int getXCor() {
        return xCor;
    }


    public int getYCor() {
        return yCor;
    }

}
