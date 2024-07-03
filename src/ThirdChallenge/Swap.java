package ThirdChallenge;

public class Swap {
    public static void main(String[] args) {
        int x = 85;
        int y = 1909;

        System.out.println("Before swapping x=" + x + " and y=" + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping x=" + x + " and y=" + y);
    }
}