import java.util.*;
public class Disjoints {
    public static int find(int[] lead, int node) {
        if (lead[node] != node) {
            lead[node] = find(lead, lead[node]);
        }
        return lead[node];
    }

    public static void join(int[] lead, int l, int r) {
        lead[find(lead, l)] = find(lead, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int[] lead = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            lead[i] = i;
        }
        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            join(lead, l, r);
        }
        Set<Integer> NoOfDisjoints = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            NoOfDisjoints.add(find(lead, i));
        }
        System.out.println(NoOfDisjoints.size());
    }
}
