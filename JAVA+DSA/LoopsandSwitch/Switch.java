import java.util.Scanner;
public class Switch{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        // String fruit = input.next();

        // switch (fruit){
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("Sweet Fruit & red in color");
        //         break;
        //     default:
        //         System.out.println("Enter valid input");

        // }
        int day = input.nextInt();
        // switch (day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("enter valid day");
        
        // }


        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

    }
}