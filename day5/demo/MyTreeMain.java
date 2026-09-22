
class MyNode {
  MyNode left;
  MyNode right;
  int data;

  MyNode() {
  }

  MyNode(int val) {
    this.data = val;
  }
}

class MyTree {
  MyNode root;

  public MyTree() {
    this.root = null;
  }

  // Example Depth-First Search (DFS) Traversal: In-Order (Left -> Root -> Right)
  public void inOrderTraversal(MyNode node) {
    if (node == null) {
      return;
    }
    inOrderTraversal(node.left); // Visit left subtree
    System.out.print(node.data + " "); // Visit root
    inOrderTraversal(node.right); // Visit right subtree
  }
}

public class MyTreeMain {

  public static void main(String[] args) {
    MyTree tree = new MyTree();

    // Initialize nodes
    tree.root = new MyNode(1);
    tree.root.left = new MyNode(2);
    tree.root.right = new MyNode(3);
    tree.root.left.left = new MyNode(4);

    // @formatter:off
    /* Tree structure created:
               1
              / \
             2   3
            /
           4
    */

    // Traverse the tree
    System.out.print("In-Order Traversal: ");
    tree.inOrderTraversal(tree.root);
    // Output: 4 2 1 3
  }
}
