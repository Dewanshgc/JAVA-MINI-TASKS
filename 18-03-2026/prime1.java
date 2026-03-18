import java.util.Scanner;

public class PrimeWhileHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            while (i <= num / 2) {   // using num/2
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        sc.close();
    }
}