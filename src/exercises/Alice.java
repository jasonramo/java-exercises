package exercises;

import java.util.Scanner;

//why does it only look at the first word???

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner in = new Scanner(System.in);
        System.out.println("What phrase are you looking for?: ");
        String term = in.nextLine();
        //System.out.println(term);

        if (sentence.toLowerCase().contains(term.toLowerCase())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
