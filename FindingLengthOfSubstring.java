import java.util.*;
public class FindingLengthOfSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int maxlen=0;
        int endindex=0;
        int[][] substring=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    substring[i][j]=substring[i-1][j-1]+1;
                    if(substring[i][j]>maxlen){
                        maxlen=substring[i][j];
                        endindex=i;
                    }
                }
            }
        }
        System.out.println("length : "+maxlen);
        System.out.print("And the substring is : ");
        for(int k=endindex-maxlen;k<endindex;k++){
            System.out.print(s1.charAt(k));
        }

    }
}
