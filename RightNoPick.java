import java.util.*;

public class RightNoPick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix dimension");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        long[][] dp=new long[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                if(i==0){
                    dp[i][j]=arr[i][j];
                }
            }
        }
        for(int i=1;i<r;i++){
            long[] fsmax=FSmax(dp,i-1,c);
            long fmax=fsmax[0];
            long smax=fsmax[1];
            for(int j=0;j<c;j++){
                dp[i][j]=arr[i][j]+(dp[i-1][j]==fmax?smax:fmax);
            }
        }
        sc.close();
        long[] ans=FSmax(dp,r-1,c-1);
        System.out.println(ans[0]);

    }
    public static long[] FSmax(long[][] dp,int r,int c){
        long fmax=Integer.MIN_VALUE;
        long smax=Integer.MIN_VALUE;
        
        for(int i=0;i<c;i++){
            if(dp[r][i]>=fmax){
                smax=fmax;
                fmax=dp[r][i];
            }
            else if(dp[r][i]>smax){
                smax=dp[r][i];
            }
        }
        return new long[]{fmax,smax};
        
    }
}
