/**
 * A node in a doubly-linked list representing one page of a note.
 */
public class PageNode {
  private final int pageNumber;
  private final String content;
  private PageNode prev;
  private PageNode next;

  public PageNode(int pageNumber, String content) {
    this.pageNumber = pageNumber;
    this.content = content;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public String getContent() {
    return content;
  }

  public PageNode getPrev() {
    return prev;
  }

  public void setPrev(PageNode prev) {
    this.prev = prev;
  }

  public PageNode getNext() {
    return next;
  }

  public void setNext(PageNode next) {
    this.next = next;
  }
}
