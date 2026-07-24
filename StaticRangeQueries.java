import java.util.*;
public class StaticRangeQueries {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q= sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1]+sc.nextInt();
        }
        while(q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            list.add(arr[r]-arr[l-1]);
        }

        for(int i:list){
            System.out.println(i);
        }
    }
}
