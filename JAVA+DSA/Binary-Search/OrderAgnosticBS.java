public class OrderAgnosticBS{
    public static void main(String[] args){
        int[] arr = {99,87,76,65,43,32,22,21,12,7,2};
        int target = 76;
        int ans = order(arr,target);
        System.out.println(ans);
    }
    static int order(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc=arr[start]<arr[end];

            while(start<=end){
                int mid = (start+end)/2;

                if (arr[mid]==target){
                return mid;
            }
                if (isAsc){

                    if (arr[mid]>target){
                        end = mid-1;
            }
                    else{ 
                        start = mid +1;
            }
        }       else{
    

                if (arr[mid]>target){
                    start = mid +1;

            }
            else{
                end = mid-1;
            }
            
        }
        }
        return -1;
    } 
}