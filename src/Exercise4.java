public class Exercise4 {
    public static void main(String[] args) {
        hasSharedDigit(15,55);
    }

    public static boolean hasSharedDigit(int value1, int value2) {
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        if ((value1 >= 10 && value1 <= 99) && (value2 >= 10 && value2 <= 99)) {
            digit1 = value1 / 10;
            digit2 = value1 % 10;
            digit3 = value2 / 10;
            digit4 = value2 % 10;
            if (digit1 == digit3 || digit1 == digit4) {
                return true;
            } else return digit2 == digit3 || digit2 == digit4;
        } else {
            return false;
        }
    }
}
