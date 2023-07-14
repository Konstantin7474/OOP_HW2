//Добавить файл с описанием интерфейса.
//В котором описать два метода, void step(); и String getInfo();
//Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
//Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров наследников BaseHero.
//Удалить ненужные методы из абстрактного класса, если такие есть. В main пройти по спискам и вызвать у всех персонажей getInfo.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {

        List<BaseHero> list1 = generateHero(10);
        List<BaseHero> list2 = generateHero(10);
        System.out.println("\nСписок_1:");
        list1.forEach(u -> System.out.println(u.getInfo()));

        System.out.println("\nСписок_2:");
        list2.forEach(u -> System.out.println(u.getInfo()));
        System.out.println();
    }

    private static List<BaseHero> generateHero(int count) {
        List<BaseHero> list = new ArrayList<>();
        for ( int i = 0; i < count; i++ ) {
            switch( new Random().nextInt( 7 ) ) {
                case 0:
                    list.add( new Peasant( getName(), 3, 100 ) );
                    break;
                case 1:
                    list.add( new Mag( getName(), 5, 150 ) );
                    break;
                case 2:
                    list.add( new Sniper( getName(), 6, 120 ) );
                    break;
                case 3:
                    list.add( new Rubber( getName(), 9, 80 ) );
                    break;
                case 4:
                    list.add( new Spearman( getName(), 8, 200 ) );
                    break;
                case 5:
                    list.add( new Crossbowman( getName(), 7, 110 ) );
                    break;
                default:
                    list.add( new Monk( getName(), 4, 90 ) );
            }
        }
        return list;
    }

    private static Class<? extends Program> getName(){
        return Program.class;
    }


}

