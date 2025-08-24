public class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {17,12}
        };
        int target =3;
        int[] ans = search(arr,target);
        System.out.println(ans[0]+","+ans[1]);
    }
    static int[] search(int[][] arr,int target  ){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[] {row,col};
            }
        }
    }
    return new int[] {-1,-1};
    }
}