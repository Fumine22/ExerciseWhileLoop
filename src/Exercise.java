public class Exercise {
    public static void main(String[] args) {
        isPalindrome(454);
    }

    public static boolean isPalindrome(int number) {
        int lastDigits;
        int reverse = 0;
        int checkNum = number;
        while (number != 0) {
            lastDigits = number % 10;
            reverse = (reverse * 10) + lastDigits;
            number = number / 10;
        }
        if (checkNum == reverse) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
