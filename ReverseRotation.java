import java.util.*;

public class ReverseRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        int pos = n - 1;

        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt() % n;

            if (t == 1) {
                pos = (pos + x) % n;
            } else {
                System.out.println(s.charAt((pos + x) % n));
            }
        }
    }
}