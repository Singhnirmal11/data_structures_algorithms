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

class DLLDelKth {
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

  static Node DelKth(Node head, int k) {
    int cnt = 0;
    Node temp = head;
    while (temp != null) {
      cnt++;
      if (cnt == k)
        break;
      temp = temp.next;
    }
    Node prev = temp.back;
    Node front = temp.next;

    if (prev == null && front == null) {
      return null;
    } else if (prev == null) {
      return front;
    } else if (front == null) {
      return prev;
    }
    prev.next = front;
    front.back = prev;
    temp.next = null;
    temp.back = null;
    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = convertArr2DLL(arr);
    head = DelKth(head, 3);
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}
