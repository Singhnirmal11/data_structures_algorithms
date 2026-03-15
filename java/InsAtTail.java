
class Node {
  int data;
  Node next;

  Node(int data1, Node next1) {
    this.data = data1;
    this.next = next1;
  }
}

public class InsAtTail {
  private static Node convertArr2LL(int arr[]) {
    Node head = new Node(arr[0], null);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i], null);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  static Node insertTail(Node head, int val) {
    if (head == null)
      return new Node(val, null);

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node newNode = new Node(val, null);
    temp.next = newNode;
    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = convertArr2LL(arr);
    head = insertTail(head, 100);
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}
