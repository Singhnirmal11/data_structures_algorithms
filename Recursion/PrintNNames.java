import java.util.*;
public class PrintNNames {

  static void printf(int i,int n){
  if(i>n) return;
  System.out.println("Nirmal");
    printf(i+1,n);
}
  public static void main(String[]args){
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printf(1,n);
  }
}

