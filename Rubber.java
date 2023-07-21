public class Rubber extends BaseHero {
    private int secrecy;
    private int maxSecrecy;

    private int speed;
    private int maxSpeed;

    private int xCor;
    private int yCor;


    public Rubber(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Rubber #%d", ++Rubber.number),
                Rubber.r.nextInt(100, 200));
        this.maxSecrecy = Rubber.r.nextInt(50, 150);
        this.secrecy = maxSecrecy;


        this.maxSpeed = Rubber.r.nextInt(0, 15);
        this.speed = maxSpeed;

        this.xCor = Rubber.r.nextInt(0,150);
        this.yCor  = Rubber.r.nextInt(0,150);
    }

    public String getInfo() {
        return String.format("%s  Secrecy: %d Position: X%d, Y%d Spedd: %d", super.getInfo(), this.secrecy, this.xCor, this.yCor, this.speed);
    }
    public int getXCor() {
        return xCor;
    }

    public int getYCor() {
        return yCor;
    }

}