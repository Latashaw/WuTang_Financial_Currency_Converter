package latasha.CurrencyConverter;

import java.util.Scanner;

/**
 * Created by latashawatson on 2/21/17.
 */
public class Display {

    public static void println(String str) {
        System.out.println(str);
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        System.out.print("user input >> ");
        Scanner scanner = new Scanner(System.in);
        String userStringInput = scanner.nextLine();
        return userStringInput;
    }

    public static double getDoubleInput(String prompt) {
        println(prompt);
        println("user input >> ");
        Scanner scanner = new Scanner(System.in);
        double userDoubleInput = scanner.nextDouble();
        return userDoubleInput;
    }
}
