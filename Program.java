import java.util.*;

public class Program {

    public static void main(String[] args) {


        ArrayList<BaseHero> list1 = (ArrayList<BaseHero>) generateHero(10);
        System.out.println("\nСписок_1:");
        list1.forEach(u -> System.out.println(u.getInfo()));

        ArrayList<BaseHero> list2 = (ArrayList<BaseHero>) generateHero(10);
        System.out.println("\nСписок_2:");
        list2.forEach(u -> System.out.println(u.getInfo()));


        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите персонажа из списка 1 (введите номер):");
        int choice = scanner.nextInt();

        BaseHero selectedHero1 = null;

        if (choice >= 1 && choice <= list1.size()) {
            selectedHero1 = list1.get(choice - 1);
            System.out.println("Выбран персонаж из списка 1: " + selectedHero1.getInfo());
        } else {
            System.out.println("Неправильный выбор.");
        }


        double shortestDistanceList1 = Double.MAX_VALUE;
        BaseHero closestHeroList1 = null;

        for (BaseHero hero : list2) {
            if(selectedHero1 != hero){
                double distance = calculateDistance(selectedHero1, hero);
                if (distance < shortestDistanceList1) {
                    shortestDistanceList1 = distance;
                    closestHeroList1 = hero;
                }
            }
        }


        if (closestHeroList1 != null) {
            System.out.println("Ближайший персонаж из списка 2: " + closestHeroList1.getInfo());
            System.out.println("Расстояние: " + shortestDistanceList1);
        } else {
            System.out.println("В списке 2 нет ближайшего персонажа.");
        }





        System.out.println("\nВыберите персонажа из списка 2 (введите номер):");
        int choice2 = scanner.nextInt();

        BaseHero selectedHero2 = null;

        if(choice2 >=11&&choice2 <=(list1.size()+list2.size()))

        {
            int index = choice2 - list1.size() - 1;
            selectedHero2 = list2.get(index);
            System.out.println("Выбран персонаж из списка 2: " + selectedHero2.getInfo());
        } else {
            System.out.println("Неправильный выбор.");
        }


        double shortestDistanceList2 = Double.MAX_VALUE;
        BaseHero closestHeroList2 = null;



        for (BaseHero hero : list1) {
            if(selectedHero2 != null && selectedHero2 != hero){
                double distance = calculateDistance(selectedHero2, hero);
                if (distance < shortestDistanceList2) {
                    shortestDistanceList2 = distance;
                    closestHeroList2 = hero;
                }


            }
        }


        if (closestHeroList2 != null) {
            System.out.println("Ближайший персонаж из списка 1: " + closestHeroList2.getInfo());
            System.out.println("Расстояние: " + shortestDistanceList2);
        } else {
            System.out.println("В списке 1 нет ближайшего персонажа.");
        }


    }




    private static double calculateDistance(BaseHero selectedHero1, BaseHero hero) {
        int x1 = selectedHero1.getXCor();
        int y1 = selectedHero1.getYCor();
        int x2 = hero.getXCor();
        int y2 = hero.getYCor();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


    }


    private static List<BaseHero> generateHero(int count) {
        List<BaseHero> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list.add(new Peasant(getName(), 3, 100));
                    break;
                case 1:
                    list.add(new Mag(getName(), 5, 150));
                    break;
                case 2:
                    list.add(new Sniper(getName(), 6, 120));
                    break;
                case 3:
                    list.add(new Rubber(getName(), 9, 80));
                    break;
                case 4:
                    list.add(new Spearman(getName(), 8, 200));
                    break;
                case 5:
                    list.add(new Crossbowman(getName(), 7, 110));
                    break;
                case 6:
                    list.add(new Farmer(getName(), 7, 110));
                    break;
                default:
                    list.add(new Monk(getName(), 4, 90));
            }
        }
        return list;
    }

    private static Class<? extends Program> getName() {
        return Program.class;
    }
}


