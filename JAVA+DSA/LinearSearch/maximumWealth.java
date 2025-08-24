//Leetcode 1672
//n=[[1,2,3],[3,2,2]] ,have to return maximum
//return 7 (3,2,2)
public class maximumWealth{
    public static void main(String[] args){
        int[][] accounts={{1,2,3},{3,2,2}};
        //System.out.println(solution(int[][] accounts));
    }
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] account : accounts){
            int temp=0;
            for(int acc :account){
                temp=acc+temp;
            }
            if (temp>ans){
                ans  = temp;
            }
        }
        return ans;
    }
}