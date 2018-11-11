package org.launchcode.java.studios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = in.nextDouble();

        if (radius < 0) {
            System.out.println("Number must be positive!");
        }
        else {
            double area = radius * radius * Math.PI;
            System.out.println("The area of a circle of radius " + radius + " is: " + (new DecimalFormat("##.###").format(area)));
        }
    }

}
