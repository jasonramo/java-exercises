package org.launchcode.java.studios;

import sun.tools.tree.SynchronizedStatement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        //String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        Scanner in = new Scanner(System.in);
        System.out.println("What text would you like to review?");
        String myString = in.nextLine();
        int range = myString.length();
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

        for (int i = 0; i < range; i++) {
            char chars = myString.charAt(i);
            if (Character.isLetter(myString.charAt(i))) {
                if (!charCount.containsKey(chars)) {
                    charCount.put(chars, 1);
                } else {
                    charCount.put(chars, charCount.get(chars) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> chars : charCount.entrySet()) {
            System.out.println(chars.getKey() + ": " + chars.getValue());
        }
    }
}
