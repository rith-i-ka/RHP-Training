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
                if(j==0){
                    dp[i][j]=arr[i][j];
                }
            }
        }
        for(int j=1;j<c;j++){
            long[] fsmax=FSmax(dp,r,j-1);
            long fmax=fsmax[0];
            long smax=fsmax[1];
            for(int i=0;i<r;i++){
                dp[i][j]=arr[i][j]+(dp[i][j-1]==fmax?smax:fmax);
            }
        }
        sc.close();
        long[] ans=FSmax(dp,r-1,c-1);
        System.out.println(ans[0]);

    }
    public static long[] FSmax(long[][] dp,int r,int c){
        long fmax=Integer.MIN_VALUE;
        long smax=Integer.MIN_VALUE;
        
        for(int i=0;i<r;i++){
            if(dp[i][c]>=fmax){
                smax=fmax;
                fmax=dp[i][c];
            }
            else if(dp[i][c]>smax){
                smax=dp[i][c];
            }
        }
        return new long[]{fmax,smax};
        
    }
}
