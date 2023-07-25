import java.util.ArrayList;

public abstract class BaseHero implements Interface {
    protected int number;
    protected String name;
    protected int qty;
    protected int hp;
    protected int maxHp;
    protected int attack;
    protected int defense;
    protected int minDamage;
    protected int maxDamage;
    protected int cost;
    protected int initiative;

    protected Position position;
    protected Actions action;

    protected BaseHero(int qty, int x, int y, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int initiative) {
        this.name = name;
        this.number = number;
        this.qty = qty;
        position = new Position(x, y);
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.cost = cost;
        this.initiative = initiative;
        action = Actions.waiting;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getHp() {
        return hp;
    }

    public Position getPosition() {
        return position;
    }

    public String toString() {
        return String.format("%s #%d [Кол-во: %d]",
                name, number, qty, position.x, position.y);
    }

    public String toChar() {
        return name.substring(0,2);
    }

    public String getInfo() {
        return String.format("%s #%d [Кол-во: %d]",
                name, number, qty, position.x, position.y);
    }

    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        BaseHero nearestEnemy = findNearest(enemies);
        System.out.print(getInfo());
        System.out.printf(" -> Ближайшее существо: %s #%d; Растояние: %d \n",
                nearestEnemy.name,
                nearestEnemy.number,
                (int)Math.ceil(position.getDistance(nearestEnemy.position)));
    }

    public void doDamage(int damage) {
        int qtyDamage = damage / maxHp;
        if (qtyDamage < qty) {
            qty -= qtyDamage;
            hp -= damage - qtyDamage * maxHp;
        }
        else {
            die();
        }
    }

    public int doHeal(int healing) {
        int damage = maxHp - hp;
        int healingPoints = (damage > healing) ? healing : damage;
        hp += healingPoints;
        return healingPoints;
    }

    public void die() {
        qty = 0;
        hp = 0;
        action = Actions.died;
    }

    protected BaseHero findNearest(ArrayList<BaseHero> creatures) {
        double minDistance = position.getDistance(creatures.get(0).position);
        int numberNearest = 0;
        for (int i = 0; i < creatures.size(); i++) {
            double distance = position.getDistance(creatures.get(i).position);
            if (distance < minDistance) {
                minDistance = distance;
                numberNearest = i;
            }
        }
        return creatures.get(numberNearest);
    }
}