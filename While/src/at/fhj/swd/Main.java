package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

//        int num1 = 4;
//        int finishNumber = 20;
//
//        while(num1 <= finishNumber){
//            num1++;
//            if(!isEvenNumber(num1)){
//                continue;
//            }
//            System.out.println("Even number " + num1);
//        }



        int num1 = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(num1 <= finishNumber){
            num1++;
            if(!isEvenNumber(num1)){
                continue;
            }
            System.out.println("Even number " + num1);

            evenNumbersFound++;
            if(evenNumbersFound >=5){
                break;
            }

        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }


    public static boolean isEvenNumber (int num1){
        if(num1 % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
