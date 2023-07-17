//Создать класс с описанием координат, x и y.
//Добавить в абстрактный класс поле с координатами
// и пробросить его инициализацию до конструкторов персонажей.
// Farmer farmer = new Farmer(getName(), x, y);
//Найти среди противников ближайшего и вывести расстояние
// до него и его имя в консоль.

public class Program {

    public static void main(String[] args) {

        BaseHero hero1 = new Farmer();
        System.out.println(hero1.getInfo());

        BaseHero hero2 = new Mag();
        System.out.println(hero2.getInfo());

        BaseHero hero3 = new Monk();
        System.out.println(hero3.getInfo());

        BaseHero hero4 = new Crossbowman();
        System.out.println(hero4.getInfo());

        BaseHero hero5 = new Sniper();
        System.out.println(hero5.getInfo());

        BaseHero hero6 = new Rubber();
        System.out.println(hero6.getInfo());

        BaseHero hero7 = new Spearman();
        System.out.println(hero7.getInfo());

        BaseHero hero8 = new Peasant();
        System.out.println(hero8.getInfo());




        double shortestDistance = Double.MAX_VALUE;
        BaseHero closestHero = null;

        BaseHero[] heroes = {hero2, hero3, hero4, hero5, hero6, hero7, hero8};

        for (BaseHero hero : heroes) {
            double distance = calculateDistance((Farmer) hero1, hero);
            if (distance < shortestDistance) {
                shortestDistance = distance;
                closestHero = hero;
            }
        }


        if (closestHero != null) {
            System.out.println("__________________________________________________________________________");
            System.out.println("Близжайший герой: " + closestHero.getInfo());
            System.out.println("Кратчайшее растояние до Фермера: " + shortestDistance);
        } else {
            System.out.println("Нет близжайших героев.");
        }
    }

    private static double calculateDistance(Farmer farmer, BaseHero hero) {
        int x1 = farmer.getXCor();
        int y1 = farmer.getYCor();
        int x2 = hero.getXCor();
        int y2 = hero.getYCor();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

