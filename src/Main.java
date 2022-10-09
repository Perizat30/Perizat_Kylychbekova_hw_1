import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String MyNameIs;   //1)Объявить переменную типа данных String, название которой состоит из нескольких слов
        final int NUM = 30;  //2)Создать константу “NUM” типа данных int и задать ей любое значение
        String word = " Я изучаю java в свои ";  //3)Создать переменную “word” типа данных String с любым значением

        MyNameIs = word+NUM;  /*Задать значение переменной объявленной в самом начале,
        которое состояло бы из результата конкатенации константы “NUM”  и переменной “word”.*/

        System.out.println("Меня зовут Перизат." + MyNameIs);  /*Вывести на экран значение всех переменных
                                                                       в одну строку*/


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");

        } else {
            System.out.println("Вы сохранили ноль");
        }


        Scanner scan= new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scan.next();

        System.out.println(" Привет "+name);

    }
}