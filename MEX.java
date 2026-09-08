import java.util.*;
public class MEX{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0) l.add(i);
            }
            if(l.size()==1){
                System.out.println("NO");
                return;
            }
            String[] s=new String[n];
            for(int i=0;i<n;i++){
                s[i]="C";
            }
            if(l.size()>0){
                int fidx=l.get(0);
                s[fidx]="B";
                for(int i=1;i<l.size();i++){
                    s[l.get(i)]="A";
                }
            }
            System.out.println("YES");
            for(String str:s){
                System.out.print(str);
            }
            System.out.println();
            
        }
    } 
}