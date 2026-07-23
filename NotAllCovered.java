import java.util.*;

public class NotAllCovered {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int wall=sc.nextInt();
    int turret=sc.nextInt();
    int[] guarding=new int[wall+2];
    while(turret>0){
      int start,end;
      start=sc.nextInt();
      end=sc.nextInt();
      guarding[start]++;
      guarding[end+1]--;
      turret--;
    }
    int minguard=20001;
    for(int w=1;w<=wall;w++){
      guarding[w]+=guarding[w-1];
      minguard=Math.min(minguard,guarding[w]);
    }
    
    System.out.println(minguard);
  }
}
