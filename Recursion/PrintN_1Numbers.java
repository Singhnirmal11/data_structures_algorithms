import java.util.*;

public class PrintN_1Numbers {

  static void printf(int i,int n){
  if(i<1) return;
  System.out.print(i+" ");
    printf(i-1,n);
  }


  public static void main(String[]args){
      System.out.println("Enter the number:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      printf(n,n);
    }
}

