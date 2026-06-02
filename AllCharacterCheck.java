import java.util.Scanner;
public class AllCharacterCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flaglower=0;
        int flagupper=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                flaglower|=(1<<(ch-'a'));
            }
            if(ch>='A' && ch<='Z'){
                flagupper|=(1<<(ch-'A'));
            }
        }
        System.out.println(flaglower==((1<<26)-1)?"lowercase:yes":"lowercase:no");
        System.out.println(flagupper==((1<<26)-1)?"uppercase:yes":"uppercase:no");
        sc.close();
    }
}