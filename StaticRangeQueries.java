import java.io.BufferedReader;
import java.util.*;
public class StaticRangeQueries {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1]+Integer.parseInt(br.readLine());
        }
        while(q-- > 0){
            int l = Integer.parseInt(br.readLine());
            int r = Integer.parseInt(br.readLine());
            list.add(arr[r]-arr[l-1]);
        }

        for(int i:list){
            System.out.println(i);
        }
    }
}
