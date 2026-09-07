import java.util.*;
public class KDivisible {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n+1];
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++) nums[i]=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>(); 
        int rem=0;
        for(int i=1;i<=n;i++){
            rem=(rem+nums[i])%k;
            if(!map.containsKey(rem)){
                map.put(rem,i);
                dp[i]=dp[i-1];
            }
            else{
                dp[i]=Math.max(dp[i-1],dp[map.get(rem)]+1);
                map.replace(rem,i);
            }
        }
        System.out.println(dp[n]);
    }
}
