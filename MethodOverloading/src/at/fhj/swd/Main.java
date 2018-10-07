package at.fhj.swd;

public class Main {

    public static void main(String[] args) {



       double centimeters = calcFeetAndInchesToCentimeters(6, 0);
       calcFeetAndInchesToCentimeters(157);

    }

    //Video Challange
    //Ergebnis scheint richtig, wieso jedoch in wird in calcFeetInchesToCentimeters(double inches)
    //jedoch "return calcFeetAndInchesToCentimeters(feet, remainingInches)" geschrieben?

    //wie kann ich ergebnis der variable solution nur mit 2 nachkommestellen ausgeben??



    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double feetToCentimeters = (int) feet / 0.032808;
            double inchesToCentimeters = (int) inches * 2.54;
            double solution = feetToCentimeters + inchesToCentimeters;
            solution = Math.round(100.0*solution) / 100.0;
            System.out.println(feet + " Fuß, " + inchesToCentimeters + " Inches = " + solution + " cm." );
            return solution;
        } else {
            System.out.println("Keine gültige Eingabe getätigt!");
            return -1;
        }

    }


    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " Inches sind " + feet + " Fuß " + remainingInches + " übriggebliebene Inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
       return -1;
    }

}
