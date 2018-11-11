package exercises;

public class CountEven {
    public static void main(String[] args) {
        int total = 0;
        int[] list = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        for (int number : list) {
            if (number % 2 == 0) {
                total = total + number;
            }
        }
        System.out.println("Your total is: " + total);
    }

}
