package exercises;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = in.next();
        System.out.println("Hello " + userName + "!");
    }
}
