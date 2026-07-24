import java.util.*;

public class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(solve());
        }
    }
    public static int solve(){
        String r=sc.nextLine();
        String c=sc.nextLine();
        char[] col=c.toCharArray();
        char[] row=r.toCharArray();
        
        int[] mr=new int[row.length];
        int[] mc=new int[col.length];
        
        mr[0]=row[0]-'0';
        mc[0]=col[0]-'0';
        
        for(int i=1;i<row.length;i++){
            mr[i]=mr[i-1]+(row[i]-'0');
        }
        for(int i=1;i<col.length;i++){
            mc[i]=mc[i-1]+(col[i]-'0');
        }
        
        int[][] lcs=new int[mc.length+1][mr.length+1];
        for(int i=1;i<=mc.length;i++){
            for(int j=1;j<=mr.length;j++){
                if(mr[j-1]==mc[i-1]){
                    lcs[i][j]=lcs[i-1][j-1]+1;
                }else{
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        return lcs[mc.length][mr.length];
    }
}