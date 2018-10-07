package at.fhj.swd;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println(" Registered Symbol= " + registeredSymbol);


    }
}
