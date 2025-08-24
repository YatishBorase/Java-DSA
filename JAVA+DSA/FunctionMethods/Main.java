// public class Sum{
//     public static void main(String[] args){
    //     int ans = result();
    //     System.out.println("addition = "+ans);
    // }
    // static int result(){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter first number = ");
    //     int num1 = input.nextInt();
    //     System.out.print("Enter second number = ");
    //     int num2 = input.nextInt();
    //     int sum = num1+num2;
    //     return sum;

    // }
//}
// public class Sum{
//     public static void main(String[] args){
//         String msg=greet();
//         System.out.println(msg);

//     }
//     static String greet(){
//         String greeting="How are you";
//         return greeting; 
//     }





//pass the value of numbers when you are calling the method in main()
// public class Main{
//     public static void main(String[] args){
//         int ans = res(2,3);
//         System.out.println(ans);
//     }
//     static int res(int num1,int num2){
//         int sum=num1+num2;
//         return sum;
//     }
// }

public class Main{
    public static void main(String[] args){
        String ans=greet("Yatish");
        System.out.println(ans); 
    }
    static String greet(String name){
        String greeting = "Hello "+name;
        return greeting;
    }

}
