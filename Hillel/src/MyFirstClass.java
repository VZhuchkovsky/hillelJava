import java.util.Scanner;

/**
 * Created by VZhuchkovsky on 03.04.2015.
 */
public class MyFirstClass {
    public static void main(String[] params) {
        //commented text

        /*
        *some other text
         */

        greetings();
        age();

        /*
        float
        double
        */
        //long i = 123654764635425L;
        //float f = 2.5F;

        double height = 172;
        double weight = 68;

        double ratio = weight / height;


        System.out.println(String.format("%4.2f", 2.222222222));
        //System.out.println(ratio);

        //byte b = (byte) 127;
        // System.out.println(b);
        int i = 5;

        //i++;
        //++i;//Имеет самый высокий приоритет

        int b = 5 + i++;

        System.out.println(b);

        i += 4;

        //Остаток от деления
        i = 10 % 2; //i=0(Oстатка нет)


       /* boolean attendJavaCources = true;
        boolean isWednesdayToday = false;
        if (attendJavaCources() || isWednesdayToday()) {  //&& при первом значении false не будет проверять второе
            System.out.println("Im gonna to go on my lectures");
        } else {
            System.out.println("nothing to do today");
        }
        */
        // |-логическое сложение, &-логическое умножение(приоритет выше)

        //int result = 155 ^ 20;//Битовая операция исключительное или(не степень)
        //Сдвиги <<

       /* int r = 455;

        int result = r ^ 20;
        System.out.println(result);
        result = result ^ 20;
        System.out.println(result);
       */

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int inputedInt = scanner.nextInt();
        }


        if (true) {
            System.out.println("in if");
        } else if (attendJavaCources()) {
            System.out.println("in else");
        } else {
        }


        int month = 5;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 5:
                System.out.println("may");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("wrong month");
        }

        System.out.println("out of switch");


    }

    public static boolean attendJavaCources() {
        System.out.println("in first method");
        return true;
    }

    public static boolean isWednesdayToday() {
        System.out.println("in first method");
        return true;
    }

    public static void age() {
        int age = 19;

        /*
        long
        short
        byte
        */

        int i = 1;

        System.out.println("I'm " + (age + i) + " years old");

    }

    public static void greetings() {

        String a = "Hello World";

        /*
        String a, b, c;
        String b;
        String c;
*/
/*
String = a;
a = "Hello World";
 */

        System.out.println(a);

        String greeting = "My name is ";
        String name = "Vlad";

        String result = greeting + name;

        System.out.println(result);
    }
}
