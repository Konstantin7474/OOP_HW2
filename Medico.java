import java.util.ArrayList;

public abstract class Medico extends Shooter {
    private int healing;

    protected Medico(int qty, int x, int y, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int initiative, int maxShoots, int healing) {
        super(qty, x, y, number, name, maxHp, attack, defense, minDamage, maxDamage, cost, initiative, maxShoots);
        this.healing = healing;
    }

    protected BaseHero findMostPainful(ArrayList<BaseHero> creatures) {
        int maxPainful = creatures.get(0).maxHp - creatures.get(0).hp;
        int numberMostPainful = 0;
        for (int i = 0; i < creatures.size(); i++) {
            int painful = creatures.get(i).maxHp - creatures.get(i).hp;
            if (painful > maxPainful) {
                maxPainful = painful;
                numberMostPainful = i;
            }
        }
        if (maxPainful != 0) return creatures.get(numberMostPainful);
        else return null;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        System.out.print(getInfo());

        if (findMostPainful(allies) != null) {
            BaseHero mostPainful = findMostPainful(allies);
            int healingPoints = mostPainful.doHeal(healing * qty);
            System.out.printf(" -> Вылечил: %s #%d на: %d\n",
                    mostPainful.name,
                    mostPainful.number,
                    healingPoints);
        }
        else {
            BaseHero nearestEnemy = findNearest(enemies);
            int damage = ((maxDamage - minDamage) / 2 + minDamage) * qty;
            nearestEnemy.doDamage(damage);

            System.out.printf(" -> Выстрелил в: %s #%d и нанес урон: %d; У него осталось выстрелов: %d\n",
                    nearestEnemy.name,
                    nearestEnemy.number,
                    damage,
                    shoots);
        }

    }
}