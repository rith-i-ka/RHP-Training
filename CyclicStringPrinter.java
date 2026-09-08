import java.util.Scanner;

public class CyclicStringPrinter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        int m=sc.nextInt();
        int n = str.length();
        for (int i = 0; i < m; i++) {
            System.out.print(str.charAt(i % n));
        }
    }
}
