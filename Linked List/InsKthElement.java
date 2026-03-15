class Node {
  int data;
  Node next;

  Node(int data1, Node next1) {
    this.data = data1;
    this.next = next1;
  }
}

public class InsKthElement {
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

  static Node InsertK(Node head, int val, int k) {

    if (head == null) {
      if (k == 1)
        return new Node(val, null);
      else
        return head;
    }
    if (k == 1) {
      Node temp = new Node(val, head);
      return temp;
    }
    int cnt = 0;
    Node temp = head;
    while (temp != null) {
      cnt++;
      if (cnt == k - 1) {
        Node newNode = new Node(val, null);
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
    head = InsertK(head, 30, 2);
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}
