import java.util.*;

public class ManyRepunitSum {
  public static int lb(int[] nums,int target){
    int l=0,r=nums.length;
    while(l<r){
      int m=(l+r)/2;
      if(nums[m]>=target) r=m;
      else l=m+1;
    }
    return r;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++) nums[i]=sc.nextInt();
    Arrays.sort(nums);
    List<Integer> result=new ArrayList<>();
    int cfwd=0;
    int cnt=0;
    for(int i=1;i<=nums[n-1];i++){
      int lower=lb(nums,i);
      cnt=n-lower;
      cfwd+=cnt;
      result.add(cfwd%10);
      cfwd/=10;
    }
    while(cfwd!=0){
      result.add(cfwd%10);
      cfwd/=10;
    }
    for(int i=result.size()-1;i>=0;i--) System.out.print(result.get(i));
  }
}