//return how many of them contain an even number of digits
//leetcode 1295
public class Even{
    public static void main(String[] args){
        int[] nums={12,345,2,6,7869};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[] nums){
        int count=0;
        for (int num=0;num<nums.length;num++){
                if (even(num)){
                    count++;
                }
        }
        return count;
    }
    static boolean even(int num){
        int n=check(num);
        if (n%2==0){
            return true;
        }
        return false;
    }
    static int check(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
    }
}