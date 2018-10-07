package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        bark(false, 6);

    }


    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
            return true;
        }else{
            return false;
        }

    }
}


