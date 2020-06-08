public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(142,2378));
    }

    public static boolean hasSharedDigit (int firstNumber, int secondNumber){

        int firstNumberDigitCheck;
        int secondNumberDigitCheck;
        int secondNumberTemp = secondNumber;

        while (firstNumber != 0){
            firstNumberDigitCheck = firstNumber % 10;
            firstNumber = firstNumber / 10;
            while (secondNumberTemp != 0){
                secondNumberDigitCheck = secondNumberTemp % 10;
                secondNumberTemp = secondNumberTemp / 10;
                if (firstNumberDigitCheck == secondNumberDigitCheck){
                    return true;
                }
            }
            secondNumberTemp = secondNumber;
        }
        return false;
    }
}
