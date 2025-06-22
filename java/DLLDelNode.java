
class Node {
  int data;
  Node next;
  Node back;

  Node(int data1, Node next1, Node back1) {
    this.data = data1;
    this.next = next1;
    this.back = back1;
  }
}

class DLLDelNode {
  private static Node convertArr2DLL(int arr[]) {
    Node head = new Node(arr[0], null, null);
    Node prev = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i], null, prev);
      prev.next = temp;
      prev = temp;
    }
    return head;
  }

  static void DelNode(Node head) {
    Node temp = head;
    Node prev = temp.back;
    Node front = temp.next;

    if (front == null) {
      temp.back = null;
      prev.next = null;
      return;
    }
    front.back = prev;
    prev.next = front;
    temp.next = null;
    temp.back = null;
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = convertArr2DLL(arr);
    DelNode(head);
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}
