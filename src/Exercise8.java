public class Exercise8 {
    public static void main(String[] args) {
        isPerfectNumber(6);
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sum = 1;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    if (i * i != 0) {
                        sum += i + (number / i);
                    } else {
                        sum += i;
                    }
                }
            }
            if (sum == number && number != 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
