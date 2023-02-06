//import java.beans.DefaultPersistenceDelegate;

import units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//                   ************** SEMINAR1 ****************
//Написать программу с семью классами, описывающими данных в таблице персонажей. Для каждого создать
// по два конструктора и геттеры приватных полей. А также метод возвращающий строку с  кратким описанием
// персонажа. В основной программе создать списки с пятью экземплярами каждого персонажа и вывести
// информацию обо все в консоль.    ** Домашнее задание**
// Разработать иерархию классов персонажей описанных в таблице. Провести анализ(абстракция) полей необходимых
// данных и перенести обьщие в базовый класс. Так же в базовом классе переопределить метод toString для вывода
// подробной информации о персонаже. Описать удобный конструктор базового класса и классов наследников так,
// чтобы необходимые параметры передавались вызовом пустого конструктора класса наследника. В основном классе
// создать список и заполнить его экземплярами каждого нового класса. Вывести в консоль содержание списка
// переопределённым иетодом toString(). *Создать список из 50 персонажей выбранных случайным числом и
// статический метод выбирающий из списка только элементы конкретного, переданного в параметре класса и
// выводящий их описание в консоль!.
//                   ************** SEMINAR2 *****************
//Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
// Реализовать имнтерфейс в абстрактном классе. Создать два списка в классе main. В кждый из списков
// добавить по десять экземнляров наследников BaseHero. Крестьянин, Разбойник, Снайпер и Колдун могут
// быть в одном и Крестьянин Разбойник, копейщик, арбалетчик и монах в другой. Реализовать метод step()
// для магов таким образом, чтобы они могли лечить самого повреждённого из своих однополчан!) Удалить
// ненужные методы из абстрактного класса, если такие есть.
//                   ************** SEMINAR3 ***************
//Проделать код ревью своих работ! Оптимизиривать интерфейс так, чтобы в клиент коде было видно только
// публичные поля. Добавить поведение (метод step) для лучников.
//1.Если стрел больше нуля заглушка выстрел и уменьшение количества стрел
//2.Проверить есть ли крестьяне и свободны ли хоть один из них. Если да, то вернуть одну стрелу и сбросить
// флаг свободен у крестьянина.
//3.Крестьяне должны уметь поднимать свой статус "свободен"
//4.Сделать так, чтобы по нажатию Enter программа повторяла вывод на экран состояние персонажей и вызов метода step.
//                   ************** SEMINAR4 *****************
//Оптимизировать проект для вывода информации в псевдо графике.


public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) {



    init();
        Scanner scanner = new Scanner(System.in);
        while (true){
            ConsoleView.view();
            whiteSide.forEach(n -> n.step(darkSide));
            darkSide.forEach(n -> n.step(whiteSide));
            scanner.nextLine();

        }
    }


     // Создаем два файла с персонажами
    private static void init() {
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            int length = NameCharacter.values().length;

            switch (new Random().nextInt(4)) {

                case 0 -> whiteSide.add(new Farmer(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], whiteSide,  x, y++));
                case 1 -> whiteSide.add(new Rogue(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], whiteSide,  x, y++));
                case 2 -> whiteSide.add(new Sniper(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], whiteSide,  x, y++));
                default -> whiteSide.add(new Mage(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], whiteSide,  x, y++));
            }
        }
        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++){
            switch (new Random().nextInt(4)) {
                case 0 -> darkSide.add(new Farmer(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], darkSide, x, y++));
                case 1 -> darkSide.add(new Spearman(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], whiteSide,  x, y++));
                case 2 -> darkSide.add(new Crossbowman(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], whiteSide,  x, y++));
                default -> darkSide.add(new Monk(NameCharacter.values()[new Random().nextInt(NameCharacter.values().length)], whiteSide,  x, y++));
            }
        }
    }
}








