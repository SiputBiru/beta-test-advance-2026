import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList {

  // SINGLE LINKED LIST - manual (each node points only forward)

  static class SingleNode {
    int data;
    SingleNode next;

    SingleNode(int data) {
      this.data = data;
    }
  }

  static class SingleList {
    SingleNode head;
    int size;

    // Add a node at the front (O(1))
    void addFirst(int data) {
      SingleNode node = new SingleNode(data);
      node.next = head;
      head = node;
      size++;
    }

    // Add a node at the end (O(n) - must walk to the tail)
    void addLast(int data) {
      SingleNode node = new SingleNode(data);
      if (head == null) {
        head = node;
      } else {
        SingleNode current = head;
        while (current.next != null) {
          current = current.next;
        }
        current.next = node;
      }
      size++;
    }

    // push = add at the front (stack behavior, O(1))
    void push(int data) {
      addFirst(data);
    }

    // pop = remove from the front and return its value (O(1))
    int pop() {
      if (head == null) {
        throw new NoSuchElementException("pop from empty list");
      }
      int data = head.data;
      head = head.next;
      size--;
      return data;
    }

    void print() {
      SingleNode current = head;
      while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
      }
      System.out.println("null");
      // Output: 10 -> 20 -> 30 -> null
    }
  }

  static void singleManual() {
    SingleList list = new SingleList();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addFirst(5);

    System.out.println("size = " + list.size);
    list.print();
    // Output: 5 -> 10 -> 20 -> 30 -> null

    // push adds at the front
    list.push(1);
    list.push(2);
    System.out.println("size after push = " + list.size);
    list.print();
    // Output: 2 -> 1 -> 5 -> 10 -> 20 -> 30 -> null

    // pop removes from the front
    System.out.println("pop = " + list.pop()); // removes 2
    System.out.println("pop = " + list.pop()); // removes 1
    list.print();
    // Output: 5 -> 10 -> 20 -> 30 -> null
  }

  // SINGLE LINKED LIST - with java.util.LinkedList

  static void singleUtil() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addFirst(5);

    System.out.println("size = " + list.size());
    System.out.println(list);
    // Output: [5, 10, 20, 30]

    list.push(1); // push adds at the front
    list.push(2);
    System.out.println("size after push = " + list.size());
    System.out.println(list);
    // Output: [2, 1, 5, 10, 20, 30]

    System.out.println("pop = " + list.pop()); // removes 2
    System.out.println("pop = " + list.pop()); // removes 1
    System.out.println(list);
    // Output: [5, 10, 20, 30]
  }

  // DOUBLE LINKED LIST - manual (each node points both ways)

  static class DoubleNode {
    int data;
    DoubleNode prev;
    DoubleNode next;

    DoubleNode(int data) {
      this.data = data;
    }
  }

  static class DoubleList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    // Add a node at the front (O(1))
    void addFirst(int data) {
      DoubleNode node = new DoubleNode(data);
      if (head == null) {
        head = node;
        tail = node;
      } else {
        node.next = head;
        head.prev = node;
        head = node;
      }
      size++;
    }

    // Add a node at the end (O(1) - tail reference makes this fast)
    void addLast(int data) {
      DoubleNode node = new DoubleNode(data);
      if (tail == null) {
        head = node;
        tail = node;
      } else {
        node.prev = tail;
        tail.next = node;
        tail = node;
      }
      size++;
    }

    // push = add at the front (stack behavior, O(1))
    void push(int data) {
      addFirst(data);
    }

    // pop = remove from the front and return its value (O(1))
    int pop() {
      if (head == null) {
        throw new NoSuchElementException("pop from empty list");
      }
      int data = head.data;
      head = head.next;
      if (head != null) {
        head.prev = null;
      } else {
        tail = null;
      }
      size--;
      return data;
    }

    void printForward() {
      DoubleNode current = head;
      while (current != null) {
        System.out.print(current.data + " <-> ");
        current = current.next;
      }
      System.out.println("null");
      // Output: 10 <-> 20 <-> 30 <-> null
    }

    void printBackward() {
      DoubleNode current = tail;
      while (current != null) {
        System.out.print(current.data + " <-> ");
        current = current.prev;
      }
      System.out.println("null");
      // Output: 30 <-> 20 <-> 10 <-> null
    }
  }

  static void doubleManual() {
    DoubleList list = new DoubleList();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addFirst(5);

    System.out.println("size = " + list.size);
    list.printForward();
    // Output: 5 <-> 10 <-> 20 <-> 30 <-> null
    list.printBackward();
    // Output: 30 <-> 20 <-> 10 <-> 5 <-> null

    // push adds at the front
    list.push(1);
    list.push(2);
    System.out.println("size after push = " + list.size);
    list.printForward();
    // Output: 2 <-> 1 <-> 5 <-> 10 <-> 20 <-> 30 <-> null
    list.printBackward();
    // Output: 30 <-> 20 <-> 10 <-> 5 <-> 1 <-> 2 <-> null

    // pop removes from the front
    System.out.println("pop = " + list.pop()); // removes 2
    System.out.println("pop = " + list.pop()); // removes 1
    list.printForward();
    // Output: 5 <-> 10 <-> 20 <-> 30 <-> null
  }

  // DOUBLE LINKED LIST - with java.util.LinkedList
  // (descendingIterator() walks backward, proving it is doubly linked)

  static void doubleUtil() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addFirst(5);

    System.out.println("size = " + list.size());
    System.out.println("forward  = " + list);

    System.out.print("backward = ");
    var it = list.descendingIterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println();
    // Output: 30 20 10 5

    list.push(1); // push adds at the front
    list.push(2);
    System.out.println("after push = " + list);
    // Output: [2, 1, 5, 10, 20, 30]

    System.out.println("pop = " + list.pop()); // removes 2
    System.out.println("pop = " + list.pop()); // removes 1
    System.out.println("after pop  = " + list);
    // Output: [5, 10, 20, 30]
  }

  public static void main(String[] args) {
    System.out.println("=== Single Linked List (manual) ===");
    singleManual();

    System.out.println();

    System.out.println("=== Single Linked List (java.util) ===");
    singleUtil();

    System.out.println();

    System.out.println("=== Double Linked List (manual) ===");
    doubleManual();

    System.out.println();

    System.out.println("=== Double Linked List (java.util) ===");
    doubleUtil();
  }
}
