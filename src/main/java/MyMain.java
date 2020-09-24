import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int die1;
        die1 = (int)(Math.random()*6) + 1;
        return die1;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int die1, die2, sum;
        int[] pair = new int [11];
        for (int i = 0; i < n; i++) {
            die1 = rollDie();
            die2 = rollDie();
            sum = die1 + die2;
            pair[sum-2] += 1;
        }
        return pair;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("How many times do you want to roll the die? ");
		String number = scan.next();
        int n = Integer.parseInt(number);
        int[] z = sumOfTwoDice(n);
        int value;
        for (int i = 0; i < z.length; i++) {
            value = i + 2;
            System.out.println(z[i] + " pairs that summed to " + value);
        }
        scan.close();
    }
}
