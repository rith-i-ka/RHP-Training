public class MaximumSuminMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix dimension");
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] a:arr){
            System.out.println(a);
        }

    }
}
