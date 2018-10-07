package at.fhj.swd;

public class Main {

    public static void main(String[] args) {


        hasTeen(23,15,42);
    }

    // Ist eine korrekte Lösung!!

    public static boolean hasTeen(int age1, int age2, int age3){

        if((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) ||
                (age3 >= 13 && age1 <= 19)) {
            System.out.println("It is a Teen!");
            return true;
        }else {
            System.out.println("It is not a Teen!");
            return false;
        }
    }

}
