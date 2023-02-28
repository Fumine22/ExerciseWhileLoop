public class Exercise9 {
    public static void main(String[] args) {
        numberToWords(10);
    }
    public static void numberToWords (int number) {
        String word = null;
        int lastDigit;
        int reverseNum = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        } if (number == 0) {
          word = "Zero";
          System.out.println(word);
        } else {
            if (getDigitCount(number) != getDigitCount(reverseNum)) {
                reverseNum *= 10;
            }
            while (reverseNum > 0) {
                lastDigit = reverseNum % 10;
                reverseNum /= 10;
                switch (lastDigit) {
                    case 0:
                        word = "Zero";
                        break;
                    case 1:
                        word = "One";
                        break;
                    case 2:
                        word = "Two";
                        break;
                    case 3:
                        word = "Three";
                        break;
                    case 4:
                        word = "Four";
                        break;
                    case 5:
                        word = "Five";
                        break;
                    case 6:
                        word = "Six";
                        break;
                    case 7:
                        word = "Seven";
                        break;
                    case 8:
                        word = "Eight";
                        break;
                    case 9:
                        word = "Nine";
                        break;
                    default:
                        word = "Other";
                        break;
                }
                System.out.println(word);
            }
        }
    }

    public static int reverse(int numReverse) {
        int digit;
        int reverse = 0;
        while (numReverse != 0) {
            digit = numReverse % 10;
            reverse = reverse * 10 + digit;
            numReverse /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        int digit;
        int num = 0;
        if (number < 0) {
            return -1;
        } else {
            while (true) {
                ++count;
                digit = number % 10;
                num = num * 10 + digit;
                number /= 10;
                if (number == 0) {
                    break;
                }
            }
            return count;
        }
    }
}


//    String word;
//        switch (number) {
//            case 0:
//                word = "ZERO";
//                break;
//                case 1:
//                word = "ONE";
//                break;
//                case 2:
//                word = "TWO";
//                break;
//                case 3:
//                word = "THREE";
//                break;
//                case 4:
//                word = "FOUR";
//                break;
//                case 5:
//                word = "FIVE";
//                break;
//                case 6:
//                word = "SIX";
//                break;
//                case 7:
//                word = "SEVEN";
//                break;
//                case 8:
//                word = "EIGHT";
//                break;
//                case 9:
//                word = "NINE";
//                break;
//default:
//        word = "OTHER";
//        break;
//        };