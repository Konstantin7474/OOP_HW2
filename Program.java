import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Program {
    public static Random random = new Random();
    public static ArrayList<BaseHero> team1 = new ArrayList<>();
    public static ArrayList<BaseHero> team2 = new ArrayList<>();
    public static ArrayList<BaseHero> allHeroes = new ArrayList<>();


    public static void create_team_randomly(){
        HashSet<Integer> occupiedPositions = new HashSet<>(10);

        for (int i = 1; i < 11; i++) {

            switch (random.nextInt(4)){
                case 0:
                    team1.add(new Mag(random.nextInt(1, 21), 1, i));
                    break;
                case 1:
                    team1.add(new Sniper(random.nextInt(1, 51),1, i));
                    break;
                case 2:
                    team1.add(new Rubber(random.nextInt(1, 201),1, i));
                    break;
                default:
                    team1.add(new Peasant(random.nextInt(1, 101),1, i));
            }
        }
        System.out.println("Команда 1:");
        for (BaseHero hero : team1) {
            System.out.println(hero.getInfo());
        }

        occupiedPositions.clear();
        for (int i = 1; i < 11; i++) {

            switch (random.nextInt(4)){
                case 0:
                    team2.add(new Monk(random.nextInt(1, 21), 10, i));
                    break;
                case 1:
                    team2.add(new Bowman(random.nextInt(1, 51), 10, i));
                    break;
                case 2:
                    team2.add(new Spearman(random.nextInt(1, 51),10, i));
                    break;
                default:
                    team2.add(new Peasant(random.nextInt(1, 101),10, i));
            }
        }
        System.out.println("\nКоманда 2:");
        for (BaseHero hero : team2) {
            System.out.println(hero.getInfo());
        }

        allHeroes.addAll(team1);
        allHeroes.addAll(team2);

    }
    public static void do_step() {

        System.out.println("\nКоманда 1:");
        team1.forEach(creature -> creature.step(team2, team1));
        System.out.println("\nКоманда 2:");
        team2.forEach(heroes -> heroes.step(team1, team2));

        allHeroes.sort(((o1, o2) -> o2.getInitiative() - o1.getInitiative()));
        int i = 0;
        for (BaseHero hero: allHeroes) {
            System.out.printf("Ход %d\n", ++i);
            if (team1.contains(hero)) {
                hero.step(team2, team1);
            }
            else {
                hero.step(team1, team2);
            }
        }
    }
    public static void main(String[] args) {
        create_team_randomly();
        for (int i = 0; i < 10; i++) {
            View.view();
            do_step();
        }
    }
}