package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(-1,100));
        //sumOdd(-1, 100);


    }

    //ist eine korrekte Lösung!!


    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    public static int sumOdd(int start, int end) {

        int sum = 0;

        if ((start > 0 && (end > 0) && (end >= start))) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum = sum + i;
                }
            }

        }
        System.out.println(sum);
        return sum;
    }
}
