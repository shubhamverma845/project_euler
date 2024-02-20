public class EvenFibonacciNumbers {
    public static int evenFibonacciNumbersSum(int num) {
        
        int a = 1;
        int b = 2;
        int t = 0;
        int sum = b;

        while(t < num) {
            t = a + b;
            if(t % 2 == 0) {
                sum += t;
            }
            a = b;
            b = t;
        }
        return sum;
    }
}
