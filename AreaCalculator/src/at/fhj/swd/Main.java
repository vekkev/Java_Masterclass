package at.fhj.swd;

public class Main {

    public static void main(String[] args) {

        area(-1.0);
        area(-1.0,4.0);

    }

    //Ist eine korrekte Lösung!!

    public static double area (double radius){
        if(radius <0){
            System.out.println("Negative Value!");
            return -1.0;
        }else {
            double PI = 3.14159;
            double area = radius*radius*PI;
            System.out.println("Der Umfang des Kreises beträgt = " + area);
            return area;
        }
    }


    public static double area(double x, double y){
        if ((x <0) ||(y <0)){
            System.out.println("Invalid Value!");
            return -1.0;
        }else{
            double rectangleArea = x*y;
            double area= rectangleArea;
            System.out.println("Die Fläche des Rechtecks beträgt = " + rectangleArea);
            return area;
        }
    }
}
