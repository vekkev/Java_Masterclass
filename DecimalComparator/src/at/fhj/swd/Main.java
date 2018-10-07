package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        if (areEqualByThreeDecimalPlaces(3.175, 3.176)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    public static boolean areEqualByThreeDecimalPlaces (double one, double two){
        System.out.println((int)(one*1000));
        return (int)(one*1000) == (int)(two*1000);

    }

}

