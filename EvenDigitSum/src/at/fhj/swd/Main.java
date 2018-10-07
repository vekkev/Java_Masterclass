package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-22));
    }


    //Ist eine richtige Lösung!!

    public static int getEvenDigitSum(int number) {

        int sumOfEvenDigits = 0;

        if (number >= 0) {
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;

                if (digit % 2 != 0) {
                    continue;
                }
                sumOfEvenDigits = sumOfEvenDigits + digit;
            }
            return sumOfEvenDigits;
        }
        return -1;
    }
}
