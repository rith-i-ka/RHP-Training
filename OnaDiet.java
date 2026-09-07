import java.util.*;

public class OnaDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();

        long[] A = new long[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextLong();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
            if (i >= m) 
            sum -= A[i - m];

            if (sum <= k) {
                System.out.println("Yes");
            } else {
                sum -= A[i];
                System.out.println("No");
            }
        }
    }
}