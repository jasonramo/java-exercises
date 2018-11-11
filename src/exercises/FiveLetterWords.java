package exercises;

public class FiveLetterWords {
    public static void main(String[] args) {
        String[] list = {"Jason", "April", "Bill", "Randy", "Richie", "Mallz"};

        for (String name : list) {
            if (name.length() == 5) {
                System.out.println(name);
            }
        }
    }
}
