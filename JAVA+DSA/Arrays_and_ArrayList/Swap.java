//Swapping
import java.util.Arrays;
public class Swap{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        swap(arr,1,5);
        System.out.println(Arrays.toString(arr));
        }
        static void swap(int[] arr,int index1,int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;

        }
    }
