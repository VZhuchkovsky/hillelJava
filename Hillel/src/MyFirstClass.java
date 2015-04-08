import java.util.Arrays;
import java.util.Random;
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
        //int i = 5;

        //i++;
        //++i;//»меет самый высокий приоритет

        //int b = 5 + i++;

        //System.out.println(b);

        // i += 4;

        //ќстаток от делени€
        // i = 10 % 2; //i=0(Oстатка нет)


       /* boolean attendJavaCources = true;
        boolean isWednesdayToday = false;
        if (attendJavaCources() || isWednesdayToday()) {  //&& при первом значении false не будет провер€ть второе
            System.out.println("Im gonna to go on my lectures");
        } else {
            System.out.println("nothing to do today");
        }
        */
        // |-логическое сложение, &-логическое умножение(приоритет выше)

        //int result = 155 ^ 20;//Ѕитова€ операци€ исключительное или(не степень)
        //—двиги <<

       /* int r = 455;

        int result = r ^ 20;
        System.out.println(result);
        result = result ^ 20;
        System.out.println(result);
       */

        //Scanner scanner = new Scanner(System.in);

     /*   if (scanner.hasNextInt()) {
            int inputedInt = scanner.nextInt();
        }
     */
/*
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

*/

       /* boolean iNeedEven = true;

        int oddOrEven = iNeedEven && true ? 2 : 1; //тернарный оператор

        if (iNeedEven) {
            oddOrEven = 2;
        } else {
            oddOrEven = 1;
        }

        System.out.println(oddOrEven);
        */
        /*
        float difference = (1.1f + 2.2f) - 3.3f;
        float sigma = 0.01f;
        if(Math.abs(difference) <= sigma) {
            System.out.println("equal");
        }

        if(1.1f + 2.2f == 3.3f){
            System.out.println("It is obvious");
        }else {
            System.out.println("I should study java harder");
        }
        System.out.println(1.1f + 2.2f);//double и float не сравнивать с помощью ==
    }
    */
/*
        //ћассивы
        int[] intArray = {1, 2, 3, 4, 5};
        intArray = new int[5];
        intArray = new int[10];

        intArray = Arrays.copyOf(intArray, 20);

        int[] newIntArray = {1, 2, 3, 4, 5};

        int i = newIntArray[0];

        System.out.println(i);

        newIntArray[0] = 10;
        i = newIntArray[0];

        System.out.println(i);

        System.out.println(Arrays.toString(newIntArray)); // вывод массива

        System.out.println(newIntArray.length); // вывод размера массива

        System.out.println("Before for");
        */
/*
        for (int j = 0; j < newIntArray.length; j++) {
            int element = newIntArray[j];
            System.out.println(element);
        }
        */
       /*
        for (int j = 0; j < newIntArray.length; j++) {
            if (j == 3) ;
            {
                continue;
            }

        }
      */
        /*
        boolean[] boolArray = {true,true,false};
        for(boolean element : boolArray){
            System.out.println(element);
        }
        */
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()){
            scanner.next(); //очистка
        }
        int input = scanner.nextInt();
        System.out.println("in: " + input);

        //цикл с предусловием
        do {

        }while (true);

       // Random random = new Random();
       // int randomNumber = random.nextInt(10);
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
