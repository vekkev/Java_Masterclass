package at.fhj.swd;

public class Main {

    public static void main(String[] args) {


        System.out.println(hasSharedDigit(9, 99));
    }

    //Ist eine richtige Lösung!!

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            while (num1 > 0) {
                while (num2 > 0) {
                    if (num1 % 10 == num2 % 10)
                        return true;
                        num2 = num2 / 10;


                    }
                    num1 = num1 / 10;
                }
            }
        return false;
        }

    }
