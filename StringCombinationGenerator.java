import java.util.Scanner;

public class StringCombinationGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        for(int noofcombi=1;noofcombi<(1<<l);noofcombi++){
            String combi="";
            for(int i=0;i<l;i++){
                if((noofcombi&(1<<i))>0){
                    combi+=s.charAt(i);
                }
            }
            System.out.println(combi);
        }
    
    sc.close();
    }
}
