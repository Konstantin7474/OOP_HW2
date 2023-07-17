public class Mag extends BaseHero {
    private int mana;
    private int maxMana;

    private int xCor;
    private int yCor;


    public Mag() {
        super(String.format("Hero_Mag #%d", ++Mag.number),
                Mag.r.nextInt(100, 200));
        this.maxMana = Mag.r.nextInt(50, 150);
        this.mana = maxMana;
        this.xCor = Mag.r.nextInt(0,150);
        this.yCor  = Mag.r.nextInt(0,150);
    }

    public String getInfo() {
        return String.format("%s  Mana: %d Position: X%d, Y%d",super.getInfo(), this.mana, this.xCor, this.yCor);
    }


    public int getXCor() {
        return xCor;
    }


    public int getYCor() {
        return yCor;
    }

}