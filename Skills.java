public enum Skills {
    Bowman("Лучник", 10, 6, 3, 2, 3, 100, 9, 12, 0),
    Mag("Маг", 25, 11, 8, 7, 9, 350, 8, 24, 4),
    Monk("Монах", 30, 12, 7, 10, 12, 400, 7, 12, 2),
    Peasant("Крестьянин", 1, 1, 1, 1, 1, 10, 1, 0, 0),
    Spearman("Копейщик", 10, 4, 5, 1, 3, 60, 4, 0, 0),
    Sniper("Снайпер", 15, 12, 10, 8, 10, 400, 10, 32, 0),
    Rubber("Разбойник", 4, 6, 1, 1, 2, 100, 10, 0, 0),

    ;

    public final String NAME;
    public final int MAX_HP;
    public final int ATTACK;
    public final int DEFENCE;
    public final int MIN_DAMAGE;
    public final int MAX_DAMAGE;
    public final int COST;
    public final int MAX_SHOOTS;
    public final int HEALING;
    public final int IMITIATIVE;

    Skills(String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int initiative, int maxShoots, int healing) {
        this.NAME = name;
        this.MAX_HP = maxHp;
        this.ATTACK = attack;
        this.DEFENCE = defense;
        this.MIN_DAMAGE = minDamage;
        this.MAX_DAMAGE = maxDamage;
        this.COST = cost;
        this.IMITIATIVE = initiative;
        this.MAX_SHOOTS = maxShoots;
        this.HEALING = healing;
    }
}