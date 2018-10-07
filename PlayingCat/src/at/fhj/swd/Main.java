package at.fhj.swd;

public class Main {

    public static void main(String[] args) {


        isCatPlaying(false, 35);
    }


    //Ist eine korrekte Lösung!

    public static boolean isCatPlaying(boolean summer, int temperatur){
        if (temperatur >=25 && temperatur <= 35){
            System.out.println("Cats are playing!");
            return true;
        } else if((summer == true) && ((temperatur >=25) && (temperatur <= 45))){
            System.out.println("Cats are playing even it´s summer!");
            return true;
        } else{
            System.out.println("No cat is playing because its too hot or too cold!");
            return false;
        }
    }

}
