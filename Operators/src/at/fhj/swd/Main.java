package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        double myDoubleV = 20d;
        double mySecondDoubleV = 80;

        double totalV = (myDoubleV + mySecondDoubleV)*25;
        System.out.println(totalV);

        double remainingTotal = totalV % 40;

        if(remainingTotal <= 20)
            System.out.println("Total was over the limit");

    }
}
