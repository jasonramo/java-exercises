package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the height: ");
        Float height = in.nextFloat();
        System.out.println("What is the width: ");
        Float width = in.nextFloat();
        Float area = height * width;
        System.out.println("The area of the rectangle is " + area + "!");
    }
}
