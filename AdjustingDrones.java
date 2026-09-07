import java.util.*;
public class AdjustingDrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] cnt=new int[a+a+a+1];
            for(int j=0;j<a;j++) {
                int x = sc.nextInt();
                cnt[x]++;
            }
            int ans=0;
            for(int j=0;j<=2*a;j++) {
                int cur=j;
                while(cnt[cur]>b) {
                    cnt[cur+1]+=cnt[cur]-1;
                    cnt[cur]=1;
                    cur++;
                }
                ans=Math.max(ans,cur-j);
            }
            System.out.println(ans);
        }
    }
}