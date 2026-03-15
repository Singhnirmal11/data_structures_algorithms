
class Node {
  int data;
  Node next;

  Node(int data1, Node next1) {
    this.data = data1;
    this.next = next1;
  }
}

class LengthOfLL {
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

  public static int lengthOfALL(Node head) {
    int cnt = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      cnt++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = convertArr2LL(arr);
    System.out.print(lengthOfALL(head));
  }
}
