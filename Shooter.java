import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int shoots;
    protected int maxShots;


    protected Shooter(int qty, int x, int y, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int initiative, int maxShots) {
        super(qty, x, y, number, name, maxHp, attack, defense, minDamage, maxDamage, cost, initiative);
        this.maxShots = maxShots;
        this.shoots = maxShots;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
//         super.step(enemies);
        System.out.print(getInfo());
        if (hp <= 0) return;
        if (shoots <= 0) return;

        BaseHero nearestEnemy = findNearest(enemies);
        int damage = ((maxDamage - minDamage) / 2 + minDamage) * qty;
        nearestEnemy.doDamage(damage);
        boolean savedShoot = false;
        for (BaseHero allie: allies) {
            if (allie.name.equals("Крестьянин") && allie.action.equals(Actions.waiting)) {
                savedShoot = true;
                allie.action = Actions.givesArrow;
                break;
            }
        }
        System.out.printf(" -> Выстрелил в: %s #%d и нанес урон: %d; У него осталось стрел: %d(-%d)\n",
                nearestEnemy.name,
                nearestEnemy.number,
                damage,
                shoots,
                savedShoot ? 0 : 1);

        if (savedShoot) return; else shoots--;
    }
}