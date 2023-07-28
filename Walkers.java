import java.util.ArrayList;

public abstract class Walkers extends BaseHero {

    protected Walkers(int qty, int x, int y, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int initiative) {
        super(qty, x, y, number, name, maxHp, attack, defense, minDamage, maxDamage, cost, initiative);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        if (this.hp <= 0) return;
        BaseHero nearestEnemy = findNearest(enemies);

        if (this.position.getDistance(nearestEnemy.position) < 2) {
            int damage = ((maxDamage - minDamage) / 2 + minDamage) * qty;
            nearestEnemy.doDamage(damage);
            System.out.printf(" -> Ударил в: %s #%d и нанес урон: %d;\n",
                    nearestEnemy.name,
                    nearestEnemy.number,
                    damage);
            return;
        }


        Position dot = new Position(position.x, position.y);

        if (Math.abs(this.position.x - nearestEnemy.position.x) > Math.abs(this.position.y - nearestEnemy.position.y)) {
            if (this.position.x < nearestEnemy.position.x) {
                dot.x += 1;
            } else {
                dot.x -= 1;
            }
        } else {
            if (this.position.y < nearestEnemy.position.y) {
                dot.y += 1;
            } else {
                dot.y -= 1;
            }
        }

        boolean flag = false;
        for (BaseHero item : allies) {
            if (item.position.x == dot.x & item.position.y == dot.y & item.hp > 0) flag = true;
        }

        if (flag) return;
        this.position.x = dot.x;
        this.position.y = dot.y;


    }
}