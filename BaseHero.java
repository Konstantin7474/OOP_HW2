import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;


    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }


    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;

    }


    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s  ",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public abstract int getXCor();

    public abstract int getYCor();

}

