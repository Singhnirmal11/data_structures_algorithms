
import java.util.*;

public class SubsequenceSum {
  public static void sub(int idx,List<Integer> ds,int arr[],int n,int s,int sum){
      if(idx==n){
        if(s==sum){
          for(int it:ds){
            System.out.print(it+" ");
          }
          System.out.println();
        }
        return;
      }
      ds.add(arr[idx]);
      s+=arr[idx];
      sub(idx+1,ds,arr,n,s,2);
      ds.remove(ds.size()-1);
      s-=arr[idx];
      sub(idx+1,ds,arr,n,s,2);
    }
    public static void main(String[]args){
      int arr[]={1,2,1};
      int n=arr.length;
      List<Integer> ds=new ArrayList<>();
      int s=0;
      sub(0,ds,arr,n,s,2);
    }
}
