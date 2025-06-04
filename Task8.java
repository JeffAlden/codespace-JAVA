public class Task8 {

    public static void main(String[] args) {
        int sum = sumAndCumulative(4, 5, 10);
        System.out.println("Total sum: " + sum);
    }

    public static int sumAndCumulative(int... numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            int cumulativeSum = 0;
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }
            System.out.println("Cumulative sum for " + number + ": " + cumulativeSum);
            totalSum += cumulativeSum;
        }
        return totalSum;
    }
}