import java.util.*;
public class P101{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int lt=0,rt=n-1;
            while(lt<n && arr[lt]==0)lt++;
            while(rt>=0 && arr[rt]==0)rt--;
            if(lt<=rt){
                for(int i=lt+1;i<rt;i++){
                    if(arr[i]==-1){
                        arr[i]=0;
                    }
                }
                arr[lt]=1;
                arr[rt]=1;
            }
            for(int m:arr){
                System.out.print(m+" ");
            }
            System.out.println();
            
        }
    } 
}