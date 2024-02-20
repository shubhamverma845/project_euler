public class Multiplesof3or5 {
    public static int sumOfMultiplesOf3or5(int num) {
        int sum = 0;

        for(int i = 3; i < num; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        } 

        return sum;
    }
}
