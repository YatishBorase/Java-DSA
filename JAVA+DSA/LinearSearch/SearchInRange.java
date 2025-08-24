public class SearchInRange{
    public static void main(String[] args){
        int[] num={18,12,-7,3,14,28};
        //search 3 in range of index[1,4]
        int target=3;
        int start=1;
        int end=4;
        int ans = linearsearch(num,target,start,end);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            if (arr[index] == target){
                return index;
            }
        }
        return -1;

    }
}