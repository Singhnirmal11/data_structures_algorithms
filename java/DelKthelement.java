
class Node {
  int data;
  Node next;

  Node(int data1, Node next1) {
    this.data = data1;
    this.next = next1;
  }
}

class DelKthelement {

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

  static Node deleteK(Node head, int k) {
    if (head == null)
      return null;

    if (k == 1) {
      Node temp = head;
      head = head.next;
      return head;
    }

    int cnt = 0;
    Node temp = head;
    Node prev = null;
    while (temp != null) {
      cnt++;
      if (cnt == k) {
        prev.next = prev.next.next;
        break;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = convertArr2LL(arr);
    head = deleteK(head, 3);
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}
