package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
    }


    //Ist eine korrekte Lösung!!

    public static int sumFirstAndLastDigit(int number) {


        int lastDigit = number % 10;



        if(number >=0){
            while (number >= 10) {
                number = number /10;
            }
            return number + lastDigit;
        }

        return -1;
    }

}
