import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter distance in km: ");
        double km = input.nextDouble();
        System.out.println("enter speed in km/h");
        double kmh = input.nextDouble();

        System.out.println("Time required to reach " + calculateTime(km, kmh));



    }
    public static double calculateTime(double x,double v){return x/v;}
}
