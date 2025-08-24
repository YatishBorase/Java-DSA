import java.util.Scanner;
public class Temp{
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.print("Convert Celcius to Far = ");
        float tempC=input.nextFloat();
        float tempF = (tempC*9/5) +32;
        System.out.println("Tempreture = "+tempF);
    }
}
        