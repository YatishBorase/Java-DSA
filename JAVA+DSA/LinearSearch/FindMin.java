public class FindMin{
    public static void main(String[] args){
        int[] num={18,12,-7,3,14,28};
        System.out.println(mini(num));
    }
    static int mini(int[] arr){
        int min = arr[0];
        
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}