import java.util.*;
public class queue_impl {
  int MaxSize;
  int currsize;
  int queue[];
  int start;
  int end;
  public queue_impl(int size){
    MaxSize=size;
    currsize=0;
    queue=new int[MaxSize];
    start=-1;
    end=-1;
  }

  public void push(int x){
    if(currsize==MaxSize){
      System.out.println("Queue is full");
      return;
    }
    if (currsize==0){
      start=0;
      end=0;
    }
    else{
      end=((end+1)% MaxSize);
    }
    queue[end]=x;
    currsize++;
  }

  public int pop(){
    if(currsize==0){
      System.out.println("Queue is empty");
      return -1;
    }
    int element=queue[start];
    if(currsize==1){
      start=-1;
      end=-1;
    }
    else
      {
        start = (start + 1) % MaxSize;
      }
    currsize--;
    return element;
  }

  public void top(){
    if(currsize==0){
      System.out.println("Queue is empty");
    }
    System.out.println(queue[start]);
  }

  public void display(){
    System.out.println("Queue Elements:");
    if(start==-1 & end==-1){
      System.out.println("Queue is empty");
    }
    int i=start;
    for(int count=0;count<currsize;count++){
      System.out.print(queue[i]+" ");
      i=((i+1)%MaxSize);
    }
    System.out.println();
  }


  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    queue_impl queue=new queue_impl(5); 
    queue.push(1);
    queue.push(2);
    queue.push(3);
    queue.push(4);
    queue.push(5);
    queue.pop();
    queue.pop();
    queue.top();
    queue.display();
  }
}
