import java.util.List;

/**
 * A notebook backed by a doubly-linked list of pages. Maintains a "current"
 * cursor used for navigation.
 */
public class NoteBook {
  private PageNode head;
  private PageNode tail;
  private PageNode current;
  private int size;

  public NoteBook(List<String> pages) {
    buildList(pages);
    this.current = head;
  }

  private void buildList(List<String> pages) {
    PageNode prev = null;
    int pageNumber = 1;
    for (String content : pages) {
      PageNode node = new PageNode(pageNumber++, content);
      if (prev == null) {
        head = node;
      } else {
        prev.setNext(node);
        node.setPrev(prev);
      }
      prev = node;
      tail = node;
    }
    size = pages.size();
  }

  public boolean hasNext() {
    return current != null && current.getNext() != null;
  }

  public boolean hasPrev() {
    return current != null && current.getPrev() != null;
  }

  public void next() {
    if (hasNext()) {
      current = current.getNext();
    }
  }

  public void prev() {
    if (hasPrev()) {
      current = current.getPrev();
    }
  }

  public void first() {
    current = head;
  }

  public void last() {
    current = tail;
  }

  public PageNode getCurrent() {
    return current;
  }

  public int getSize() {
    return size;
  }

  public PageNode getHead() {
    return head;
  }
}
