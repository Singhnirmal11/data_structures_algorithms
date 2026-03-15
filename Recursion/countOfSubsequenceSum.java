public class countOfSubsequenceSum {
  static int sub(int idx,int arr[], int n, int s, int sum){
    if(idx==n){
      if(s==sum){
        return 1;
      }
      return 0;
    }
    s+=arr[idx];
    int l=sub(idx+1,arr,n,s,2);
    s-=arr[idx];
    int r=sub(idx+1,arr,n,s,2);
    return l+r;
  } 

  public static void main(String []args){
    int arr[]={1,2,1};
    int n=arr.length;
    int s=0;
    System.out.println(sub(0,arr,n,s,2));
  }
}
