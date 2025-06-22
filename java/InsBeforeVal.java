class Node {
  int data;
  Node next;

  Node(int data1, Node next1) {
    this.data = data1;
    this.next = next1;
  }
}

public class InsBeforeVal {
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

  static Node InsertBeforeVal(Node head, int ele, int val) {

    if (head == null) {
      return new Node(ele, null);
    }
    if (head.data == val) {
      Node temp = new Node(ele, head);
      return temp;
    }

    Node temp = head;
    while (temp.next != null) {

      if (temp.next.data == val) {
        Node newNode = new Node(ele, null);
        newNode.next = temp.next;
        temp.next = newNode;
        break;
      }
      temp = temp.next;
    }
    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = convertArr2LL(arr);
    head = InsertBeforeVal(head, 10, 3);
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}
