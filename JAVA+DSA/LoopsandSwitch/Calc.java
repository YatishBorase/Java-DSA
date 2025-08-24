import java.util.Scanner;
public class Calc{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Select the Operator : ");
            char op = input.next().trim().charAt(0);
            System.out.println();

            if (op == '+' || op == '-' || op == '*' || op == '/' ){
                System.out.println("Please enter two numbers : ");
                int num1=input.nextInt();
                int num2=input.nextInt();
                System.out.println();


                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    if (num2!=0){
                         ans = num1/num2;
                    }   
                }
            
                } else if (op=='x' || op=='X'){
                    break;
                } else{
                    System.out.println("Invalid Input");
                }   

            System.out.println(ans);
 

            }
        }
        
           
    }   
