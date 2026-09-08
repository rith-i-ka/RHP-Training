import java.util.*;
public class Moo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int F=n/k;
            boolean[] farm=new boolean[F];
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    int farmidx=i/k;
                    farm[farmidx]=true;
                }
            }
        
        int count=0;
        for(int i=0;i<F;i++){
            if(farm[i]==false){
                count++;
            }
        }
        System.out.println(count);
    }
    }
}