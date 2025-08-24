//Ceiling  = Greatest element in array which is smaller than or equal to target. 
public class Floor{
    public static void main(String[] args){
        int[] arr={1,2,3,12,23,45,56,78,89,99,143};
        int target = 98;
        int ans = floor(arr,target);
        System.out.println(ans);  
    }
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = (start+end)/2;

            if (arr[mid]>target){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid +1;
            }
            else{ 
                return mid;
            }
        }
        return end;
    }
}