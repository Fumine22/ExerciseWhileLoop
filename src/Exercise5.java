public class Exercise5 {
    public static void main(String[] args) {
        hasSameLastDigit(41, 22, 71);
    }
    public static boolean isValid(int range) {
        return range >= 10 && range <= 1000;
    }
    public static boolean hasSameLastDigit(int value1, int value2, int value3) {
        int digit1, digit2, digit3;
        if (isValid(value1) && isValid(value2) && isValid(value3)) {
                digit1 = value1 % 10;
                digit2 = value2 % 10;
                digit3 = value3 % 10;
                if (digit1 == digit2 || digit1 == digit3) {
                    return true;
                } else return digit2 == digit3;
        } else {
            return false;
        }
    }
}
