public class Question{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         System.out.println(isPrime(n));
//     }
//     static boolean isPrime(int n){
//         if (n<=1){
//             return false;
//         }
//         for (int i=2;i<n;i =i+1){
//             if (n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
        public static void main(String[] args){
            // Scanner input = new Scanner(System.in);
            // int n = input.nextInt();
            for (int i=100;i<1000;i=i+1){
                if (isArm(i)){
                    System.out.println(i);

                }
            }

        }
        static boolean isArm(int n){
            int sum=0;
            int temp = n;
            while(temp>0){
                int rem = temp%10;
                sum = sum + rem*rem*rem;
                temp = temp/10;
            }
            
            return n == sum;

        }
}