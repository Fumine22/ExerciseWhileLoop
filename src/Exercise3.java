public class Exercise3 {
    public static void main(String[] args) {
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number) {
        int digit = number;
        int even;
        int sum = 0;
        if (number >= 0) {
            while (digit > 0) {
                even = digit % 10;
                digit /= 10;
                if (even % 2 != 0) {
                    continue;
                }
                sum += even;
            }
            System.out.println(sum);
            return sum;
        } else {
            return -1;
        }
    }
}
