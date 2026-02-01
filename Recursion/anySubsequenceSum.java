  import java.util.*;
  public class anySubsequenceSum{
    public static boolean isSub(int idx,List<Integer> ds,int arr[],int n,int s,int sum){
      if(idx==n){
        if(s==sum){
          for(int it:ds){
            System.out.print(it+" ");
          }
          System.out.println();
          return true;
        }
        else return false;
      }
      ds.add(arr[idx]);
      s+=arr[idx];
      if(isSub(idx+1,ds,arr,n,s,2)==true) return true;
      ds.remove(ds.size()-1);
      s-=arr[idx];
      if(isSub(idx+1,ds,arr,n,s,2)==true) return true;
      return false;
    }
    
    
    
    
    
    public static void main(String[]args){
      int arr[]={1,2,1};
      int n=arr.length;
      List<Integer> ds=new ArrayList<>();
      int s=0;
      isSub(0,ds,arr,n,s,2);
    }
  }