import java.util.*;
public class stack_impl{
  int MaxSize;
  int top;
  int [] stack;

  public stack_impl(int size){
    MaxSize=size;
    top=-1;
    stack=new int[MaxSize];
  }

  public void push(int x){
    if(top>=MaxSize)
    {
      System.out.println("Stack Overflow");
    }
    else{
      top++;
      stack[top]=x;
    }
  }

  public void top(){
    if(top<0){
      System.out.println("Stack Empty");
    }
    else{
      System.out.println(stack[top]);
    }
  }

  public void pop(){
    if(top<0){
      System.out.println("Stack Underflow");
    }
    else{
      top--;
    } 
  }

  public void display(){
    if(top==-1){
      System.out.println("Stack Empty");
    }
    else{
      System.out.print("Stack Elements:");
      for(int i=1;i<=top;i++){
        System.out.print(stack[i]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[]args){
    stack_impl stack=new stack_impl(5);
    Scanner sc=new Scanner(System.in);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    stack.top();
    stack.display();
  }
}