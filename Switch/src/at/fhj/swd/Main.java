package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        char switchChar = 'B';

        switch(switchChar){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println(switchChar +" not found!");
                break;
        }
    }
}
