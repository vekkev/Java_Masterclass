package at.fhj.swd;

public class Main {

    public static void main(String[] args) {


        getDaysInMonth(10,2020);

    }

    //Ist eine korrekte Lösung!!!


    public static boolean isLeapYear (int year){
        if(year >= 1 && year <= 9999){
            if((year %4 ==0 && year % 100 != 0) || (year %400 ==0)){
                System.out.println("Is a leap year!");
                return true;
            }else{
                System.out.println("Is not a leap year!");
                return false;
            }
        }
        System.out.println("Is not in valid range!");
        return false;
    }


    public static int getDaysInMonth (int month, int year){
        if((month <1 || month >12) || (year <1 || year >9999)){
            return -1;
        }
        if (month == 2) {
            if (isLeapYear(year) == true) {
                System.out.println("Der Februar besitzt 29 Tage, wenn das Jahr " + year + " EIN Schaltjahr ist!");
                return 29;
            } else {
                System.out.println("Der Februar besitzt 28 Tage, wenn  das Jahr " + year + " KEIN Schaltjahr ist!");
                return 28;
            }
        }else {
               switch(month){
                   case 1: case 3: case 5: case 7: case 8: case 10:
                   System.out.println("Hierbei handelt es sich um ein Monat, dass 31 Tage besitzt!");
                   return 31;


                   case 4: case 6: case 9: case 11:
                   System.out.println("Hierbei handelt es sich um ein Monat, dass 30 Tage besitzt!");
                   return 30;


                   default:
                       System.out.println("Es wurde eine falsche Eingabe getätigt");
                       return -1;


               }
    }

}
}