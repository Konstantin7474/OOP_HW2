public class Spearman extends BaseHero {
    private int stamina;
    private int maxStamina;

    private int xCor;
    private int yCor;

    public Spearman() {
        super(String.format("Hero_Spearman #%d", ++Spearman.number),
                Spearman.r.nextInt(100, 200));
        this.maxStamina = Spearman.r.nextInt(50, 150);
        this.stamina = maxStamina;

        this.xCor = Spearman.r.nextInt(0,150);
        this.yCor  = Spearman.r.nextInt(0,150);
    }

    public String getInfo() {
        return String.format("%s  Stamina: %d Position: X%d, Y%d", super.getInfo(), this.stamina, this.xCor, this.yCor);
    }

    public int getXCor() {
        return xCor;
    }

    public int getYCor() {
        return yCor;
    }

}
