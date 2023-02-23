public class Exercise2 {
    public static void main(String[] args) {
        sumFirstAndLastDigit(1001);
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit;
        int firstDigit;
        int sum;
        if (number >= 0) {
            firstDigit = number;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            lastDigit = number % 10;
            sum = firstDigit + lastDigit;
            System.out.println(sum + ": The first digit is: " + firstDigit + " and the last digit is: " + lastDigit);
            return sum;
        } else {
            System.out.println("-1");
            return -1;
        }
    }
}
