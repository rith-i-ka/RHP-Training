import java.util.*;
public class EqualZeroOneSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        int value=0;
        map.put(0,-1);
        for(int i=0;i<s.length();i++){
            value=s.charAt(i)=='0'?value-1:value+1;
            
            if(map.containsKey(value)){
                maxlen=(i-(map.get(value)))>maxlen?i-map.get(value):maxlen;
            }
            else{
                map.put(value,i);
            }

        }
        System.out.println("Maximum Length : "+maxlen);
    }    
}
