import java.util.*;
public class Minus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int odd=0,evenoq=0,eveneq=0;
            for(int i=0;i<n;i++){
                int c=sc.nextInt();
                if(c%2==1) odd++;
                else{
                    int q=c/2;
                    if(q%2==1)evenoq++;
                    else eveneq++;
                }
            }
            System.out.println(Math.max(odd,Math.max(evenoq,eveneq)));
        }
    }
}