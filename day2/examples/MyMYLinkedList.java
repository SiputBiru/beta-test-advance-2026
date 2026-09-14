class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }

  Node() {
  }

}

class MyLinkedList {
  Node head;

  boolean isEmpty() {
    if (head == null) {
      System.out.println("kosong nggak ada isinya");
      return true;
    } else {
      System.out.println("ada isi!");
      return false;
    }
  }

  void addNext(Node newNode) {
    // newNode.next = new Node();
    // this.head = new Node();

    // 1. cari ujung mulai dari head
    // 2. timpa ujung.next jadi new node();
    Node cur = this.head;
    while (cur.next != null) {
      cur = cur.next;
    }
    cur.next = newNode;
  }

  // Single linked list
  // 1. ngapus pertama
  // 2. ngapus terakhir
  // 3. ngapus at index
  // 4. nambah at index

  void printAll() {
    Node cur = this.head;
    for (;;) {
      System.out.println(cur.data);
      if (cur.next == null)
        break;

      cur = cur.next;
    }
  }

}

public class MyMYLinkedList {

  public static void main(String[] args) {

    MyLinkedList my = new MyLinkedList();

    my.head = new Node(1);

    // my.printAll();

    Node newNode2 = new Node(2);
    my.addNext(newNode2);

    Node newNode3 = new Node(3);
    my.addNext(newNode3);

    my.printAll();
    // my.isEmpty();
  }
}
