public class Main{
    public static void main(String[] args){
        int[] num={12,43,56,77,69,54,67};
        int target = 69;
        int ans = linearsearch(num,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if (temp == target){
                return i;
            }
        }
        return -1;

    }
}