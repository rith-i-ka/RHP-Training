import java.io.*;
import java.util.*;

public class StaticRangeQueries {
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
   
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        long[] arr = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        }
        
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            out.println(arr[r] - arr[l - 1]);
        }
        
        out.close();
    }
}
