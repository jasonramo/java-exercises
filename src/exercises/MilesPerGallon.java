package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How far did you drive?: ");
        Float distance = in.nextFloat();
        System.out.println("How many gallons of gas did you use?: ");
        Float gas = in.nextFloat();
        Float mpg = distance / gas;
        System.out.println("You averaged " + mpg + " miles per gallon!");
    }
}
