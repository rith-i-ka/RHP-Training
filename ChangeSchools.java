import java.util.*;
public class ChangeSchools {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int nclass = sc.nextInt();
        int[] classes = new int[nclass+1];
        int m=0;
        for(int i=0;i<students;i++) {
            int a=sc.nextInt();
            classes[a]++;
            m=Math.max(m,classes[a]);
        }
        int ans=0;
        for(int i=1;i<=nclass;i++){
            if(classes[i]>=m-1) ans++;
        }
        System.out.println(ans);
    }
}
