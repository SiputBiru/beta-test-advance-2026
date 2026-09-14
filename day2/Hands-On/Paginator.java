import java.util.ArrayList;
import java.util.List;

/**
 * Splits a long text into fixed-size pages (by number of lines).
 */
public class Paginator {
  private final int linesPerPage;

  public Paginator(int linesPerPage) {
    if (linesPerPage <= 0) {
      throw new IllegalArgumentException("linesPerPage must be positive");
    }
    this.linesPerPage = linesPerPage;
  }

  public List<String> paginate(String text) {
    List<String> pages = new ArrayList<>();
    if (text == null || text.isEmpty()) {
      return pages;
    }
    String[] lines = text.split("\n", -1);
    StringBuilder current = new StringBuilder();
    int count = 0;
    for (String line : lines) {
      current.append(line).append("\n");
      count++;
      if (count >= linesPerPage) {
        pages.add(current.toString());
        current.setLength(0);
        count = 0;
      }
    }
    if (count > 0) {
      pages.add(current.toString());
    }
    return pages;
  }
}
