//Урок 5. От простого к практике
//Реализовать визуализацию своего проекта по примеру семинара с использованием приложенных классов.
// Доработать степ крестьян и магов!

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Program {
    public static Random random = new Random();
    public static ArrayList<BaseHero> team1 = new ArrayList<>();
    public static ArrayList<BaseHero> team2 = new ArrayList<>();
    public static ArrayList<BaseHero> allCreatures = new ArrayList<>();

    public static void create_army_manually() {

        team1.add(new Mag(random.nextInt(1, 21), 1, 1));
        team1.add(new Sniper(random.nextInt(1, 51),1,2));
        team1.add(new Rubber(random.nextInt(1, 201),1,3));
        team1.add(new Rubber(random.nextInt(1, 201),1,4));
        System.out.println("Команда 1:");
        for (BaseHero creature : team1) {
            System.out.println(creature.getInfo());
        }

        team2.add(new Monk(random.nextInt(1, 21), 15, 1));
        team2.add(new Bowman(random.nextInt(1, 51), 15, 2));
        team2.add(new Spearman(random.nextInt(1, 51),15,3));
        team2.add(new Peasant(random.nextInt(1, 101),15,4));
        System.out.println("\nКоманда 2:");
        for (BaseHero creature : team2) {
            System.out.println(creature.getInfo());
        }
    }
    public static void create_team_randomly(){
        HashSet<Integer> occupiedPositions = new HashSet<>(10);
        int newPosition;
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


        allCreatures.addAll(team1);
        allCreatures.addAll(team2);

    }
    public static void do_step() {


        allCreatures.sort(((o1, o2) -> o2.getInitiative() - o1.getInitiative()));
        int i = 0;
        for (BaseHero creature: allCreatures) {

            if (team1.contains(creature)) {
                creature.step(team2, team1);
            }
            else {
                creature.step(team1, team2);
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