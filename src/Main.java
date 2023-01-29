//import java.beans.DefaultPersistenceDelegate;
import java.util.ArrayList;
import java.util.Random;

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
//**************SEMINAR2**********
//Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
// Реализовать имнтерфейс в абстрактном классе. Создать два списка в классе main. В кждый из списков
// добавить по десять экземнляров наследников BaseHero. Крестьянин, Разбойник, Снайпер и Колдун могут
// быть в одном и Крестьянин Разбойник, копейщик, арбалетчик и монах в другой. Реализовать метод step()
// для магов таким образом, чтобы они могли лечить самого повреждённого из своих однополчан!) Удалить
// ненужные методы из абстрактного класса, если такие есть.
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<BaseHero> gameListOne = new ArrayList<>();
        ArrayList<BaseHero> gameListTwo = new ArrayList<>();
        gameList(gameListOne, 1, rand);
        gameList(gameListTwo, 2, rand);



//        for (BaseHero tr: gameListOne){System.out.println(tr);}

        gameListOne.forEach(item -> System.out.println(item.getInfo()+" ,"));
        System.out.println("---*---");
        gameListOne.forEach(item -> item.step(gameListOne));

//        for(BaseHero param: gameListOne){
//            param.step(gameListOne);}

// Поиск по полю "Фермер"
//        chooseHero(gameListOne, "Фермер");





    }
    // Создаем два файла с персонажами
    private static void gameList(ArrayList<BaseHero> ListOne, int mode, Random rand) {
        for (int i = 0; i < 10; i++) {
            int character = rand.nextInt(1, 5);
            if (mode == 1){
                switch (character) {
                    case 1 -> ListOne.add(new Farmer(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                    case 2 -> ListOne.add(new Rogue(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                    case 3 -> ListOne.add(new Sniper(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                    case 4 -> ListOne.add(new Mage(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                }
            }
            else {
                switch (character) {
                    case 1 -> ListOne.add(new Farmer(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                    case 2 -> ListOne.add(new Spearman(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                    case 3 -> ListOne.add(new Crossbowman(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                    case 4 -> ListOne.add(new Monk(NameCharacter.values()[rand.nextInt(NameCharacter.values().length)]));
                    }
                }
            }
        }
    // Поиск по полю heroRole
        private static void chooseHero(ArrayList<BaseHero> ListOne, String heroRole){
        System.out.printf("List of %s roles\n", heroRole);
        for(BaseHero hero: ListOne){
            if(hero.toString().contains(heroRole)){
                System.out.println((hero));
            }
        }
    }
}








