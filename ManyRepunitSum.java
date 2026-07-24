import java.util.*;

public class ManyRepunitSum {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    List<Integer> result=new ArrayList<>();
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    int cfwd=0;
    for(int ctr=1;ctr<=arr[n-1];ctr++){
      int key=Arrays.binarySearch(arr,ctr);
      int lb=key>=0?key:-(key)-1;
      int cnt=arr[n-1]-lb;
      cfwd+=cnt;
      result.add(cfwd%10);
      cfwd/=10;
    }
    while(cfwd!=0){
      result.add(cfwd%10);
      cfwd/=10;
    }
    for(int i=result.size()-1;i>=0;i--){
      System.out.print(result.get(i)+"");
    }
  }
}

