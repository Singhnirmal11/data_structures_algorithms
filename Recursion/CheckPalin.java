import java.util.*;
public class CheckPalin {
  
  static  boolean palin(int i, String str){
    int n=str.length();
    if(i>=(n/2)) return true;
    if(str.charAt(i)!=str.charAt(n-i-1)) return false;
    return palin(i+1,str);
  }


  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    System.out.println(palin(0,str));
  }
}
