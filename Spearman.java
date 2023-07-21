public class Spearman extends BaseHero {
    private int stamina;
    private int maxStamina;


    private int speed;
    private int maxSpeed;

    private int xCor;
    private int yCor;

    public Spearman(Class<? extends Program> name, int i, int i1) {
        super(String.format("Hero_Spearman #%d", ++Spearman.number),
                Spearman.r.nextInt(100, 200));
        this.maxStamina = Spearman.r.nextInt(50, 150);
        this.stamina = maxStamina;

        this.maxSpeed = Spearman.r.nextInt(0, 15);
        this.speed = maxSpeed;

        this.xCor = Spearman.r.nextInt(0,150);
        this.yCor  = Spearman.r.nextInt(0,150);
    }

    public String getInfo() {
        return String.format("%s  Stamina: %d Position: X%d, Y%d Speed: %d", super.getInfo(), this.stamina, this.xCor, this.yCor, this.speed);
    }

    public int getXCor() {
        return xCor;
    }

    public int getYCor() {
        return yCor;
    }


}
