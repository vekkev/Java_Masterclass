package at.fhj.swd;

public class Main {

    public static void main(String[] args) {
	    //width of int = 32 (4 bytes.
        int myIntValue = 5/2;

        //width of float 32 (4bytes).
        float myFloatValue =  5f/ 3f;

        //width of double = 64 (8 bytes).
        double myDoubleValue = 5d/ 3d;


        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDOubleValue = " + myDoubleValue);


        double onePound = 0.45359237d;
        double givenPounds = 200d;
        double convertedToKilograms = (onePound*givenPounds);

        System.out.println("totalKilograms = " + convertedToKilograms);
        //90.7185

        double pi = 3.1415927d;




    }

}
