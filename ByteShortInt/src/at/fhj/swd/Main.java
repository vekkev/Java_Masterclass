package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue =(byte)(myByteValue/2);
        System.out.println("myNewByteValue= " + myNewByteValue);

        //short has a width of 16
        short myShortNumber = 32767;
        short myNewShortValue= (short)(myNewByteValue/2);

        //long has a width of 64
        long myLongValue = 100L;


        //Here starts the challange-->

        byte myByteVariable = 10;
        short myShortVariable = 20;
        int myIntVariable = 50;
        long myLongVariable = 50000L + 10L*(myByteVariable + myShortVariable + myIntVariable);
        System.out.println("50000 + 10 times the sum of byte = " + myLongVariable );

    }
}
