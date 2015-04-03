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

        

        System.out.println(ratio);

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
