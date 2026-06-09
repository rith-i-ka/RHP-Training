import java.util.*;

public class AdjacentCellSum {
    public static void main(String[] args) {
        System.out.println("Enter Dimension");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        long sum=0;
        System.out.println("Enter row and column");
        int R=sc.nextInt(),C=sc.nextInt();
        int[][] diff={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i=0;i<8;i++){
            int ar=R+diff[i][0],ac=C+diff[i][1];
            if(ar>=0 && ar<r && ac>=0 && ac<c){
                sum+=matrix[ar][ac];
            }
        }
        System.out.println(sum);
    }
}
