import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Please enter the question Number for which you want the execution:");

        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (input != -1) {
            System.out.println("1: Multiples of 3 or 5");
            System.out.println("2: Even Fibonacci Numbers");
            System.out.println("-1: Exit");
            System.out.print("Enter Input::");
            input = sc.nextInt();

            switch (input) {
                case -1:
                    System.out.println("Exiting!!!");
                    break;
                case 1:
                    System.out.println(Multiplesof3or5.sumOfMultiplesOf3or5(1000));
                    break;
                case 2:
                    System.out.println(EvenFibonacciNumbers.evenFibonacciNumbersSum(4000000));
                    break;
                default:
                    System.out.println("Invalid input!!");
                    break;

            }
        }
    }
}
