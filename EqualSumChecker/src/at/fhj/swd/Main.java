package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        hasEqualSum(1, -1, 0);


    }

    //ist eine korrekte Lösung!!!

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        int sumOfFirstTwoNumbers = num1 + num2;

        if (sumOfFirstTwoNumbers == num3){
            System.out.println("Die ersten zwei nummer sind gleich wie die 3. Nummer!");
            return true;
        } else{
            System.out.println("Die ersten zwei Nummern sind nicht gleich wie die 3. Nummer");
            return false;

        }

    }
}