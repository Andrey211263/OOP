//import java.beans.DefaultPersistenceDelegate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Написать программу с семью классами, описывающими данных в таблице персонажей.
// Для каждого создать по два конструктора и геттеры приватных полей. А также метод
// возвращающий строку с  кратким описанием персонажа. В основной программе создать
// списки с пятью экземплярами каждого персонажа и вывести информацию обо все в консоль.
//** Домашнее задание**
// Разработать иерархию классов персонажей описанных в таблице. Провести анализ(абстракция)
// полей необходимых данных и перенести обьщие в базовый класс. Так же в базовом классе
// переопределить метод toString для вывода подробной информации о персонаже. Описать удобный
// конструктор базового класса и классов наследников так, чтобы необходимые параметры
// передавались вызовом пустого конструктора класса наследника. В основном классе создать
// список и заполнить его экземплярами каждого нового класса. Вывести в консоль содержание
// списка переопределённым иетодом toString(). *Создать список из 50 персонажей выбранных
// случайным числом и статический метод выбирающий из списка только элементы конкретного,
// переданного в параметре класса и выводящий их описание в консоль!.
public class Main {
    public static void main(String[] args) {
        String[] gameName = {"Витя", "Коля", "Саша", "Вася", "Даша", "Михаил", "Иван", "Сергей",
                "Серый", "Федя", "Миха", "Лютый", "Бывалый", "Тихий", "Шустрый", "Тёма", "Игорь",
                "Гога", "Давид", "Данил", "Ибрагим", "Капа", "Лера", "Левон", "Ворон"};
        ArrayList<BaseHero> farmer = new ArrayList<>();
        ArrayList<BaseHero> rogue = new ArrayList<>();
        ArrayList<BaseHero> sniper = new ArrayList<>();
        ArrayList<BaseHero> mage = new ArrayList<>();
        ArrayList<BaseHero> spearman = new ArrayList<>();
        ArrayList<BaseHero> crossbowman = new ArrayList<>();
        ArrayList<BaseHero> monk = new ArrayList<>();
        // Форимирование 50-ти случайных персонажей.
        // 1-крестьянин
        // 2-разбойник
        // 3-снайпер
        // 4-колдун
        // 5-копейщик
        // 6-арбалетчик
        // 7-монах
        int character;
        for (int i = 0; i < 50; i++) {
            character = ThreadLocalRandom.current().nextInt(1, 8);
            switch (character) {
                case 1 ->
                    farmer.add(new Farmer(gameName[ThreadLocalRandom.current().nextInt(1, 25)]));

                case 2 ->
                    rogue.add(new Rogue(gameName[ThreadLocalRandom.current().nextInt(1, 25)]));

                case 3 ->
                    sniper.add(new Sniper(gameName[ThreadLocalRandom.current().nextInt(1, 25)]));

                case 4 ->
                    mage.add(new Mage(gameName[ThreadLocalRandom.current().nextInt(1, 25)]));

                case 5 ->
                    spearman.add(new Spearman(gameName[ThreadLocalRandom.current().nextInt(1, 25)]));

                case 6 ->
                    crossbowman.add(new Crossbowman(gameName[ThreadLocalRandom.current().nextInt(1, 25)]));

                case 7 ->
                    monk.add(new Monk(gameName[ThreadLocalRandom.current().nextInt(1, 25)]));

            }
        }
        // вывод на эран сформированных персонажей
        Scanner iScaner = new Scanner(System.in);
        boolean triger = true;
        while (triger){
            System.out.println("\n     -----------------------------\n" +
                "Выберите персонажа для вывода на экран. Выход -0" +
                "         1-крестьянин\n" +
                "         2-разбойник\n" +
                "         3-снайпер\n" +
                "         4-колдун\n" +
                "         5-копейщик\n" +
                "         6-арбалетчик\n" +
                "         7-монах ");
        character = iScaner.nextInt();
            switch (character) {
                case 1 -> {
                    for (BaseHero tr : farmer) {
                        System.out.println(tr);
                    }
                }
                case 2 -> {
                    for (BaseHero tr : rogue) {
                        System.out.println(tr);
                    }
                }
                case 3 -> {
                    for (BaseHero tr : sniper) {
                        System.out.println(tr);
                    }
                }
                case 4 -> {
                    for (BaseHero tr : mage) {
                        System.out.println(tr);
                    }
                }
                case 5 -> {
                    for (BaseHero tr : spearman) {
                        System.out.println(tr);
                    }
                }
                case 6 -> {
                    for (BaseHero tr : crossbowman) {
                        System.out.println(tr);
                    }
                }
                case 7 -> {
                    for (BaseHero tr : monk) {
                        System.out.println(tr);
                    }
                }
                default ->
                    triger = false;

            }
        }
        iScaner.close();
    }

}
