import java.io.*;
import java.util.*;
public class KarenAndCoffee {
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int max = 200000;

        int[] diff = new int[max+2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            diff[l]++;
            diff[r + 1]--;
        }

        int[] count = new int[max+1];
        for(int i=1;i<=max;i++) {
            count[i]=count[i-1]+diff[i];
        }

        int[] prefix = new int[max+1];

        for (int i=1;i<=max;i++) {
            prefix[i] = prefix[i-1];
            if (count[i] >= k) prefix[i]++;
            
        }

        for (int i=0;i<q;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(prefix[b]-prefix[a-1]);
        }
    }

}

