public class MountainArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(peak(arr,target));
    }
    static int peak(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]>=target){
                end = mid;
            }
            if (arr[mid]<target){
                start = mid+1;
            }
            else{
                return end;
            }
            
            }
        return -1;
    }

   
    }
