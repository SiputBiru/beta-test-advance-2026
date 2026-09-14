import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/** Console driver for the linked-list note app (Day 2). */
public class Main {
  private static final int LINES_PER_PAGE = 15;

  public static void main(String[] args) throws IOException {
    String text = Files.readString(Path.of("notes.txt"));
    Paginator paginator = new Paginator(LINES_PER_PAGE);
    List<String> pages = paginator.paginate(text);

    if (pages.isEmpty()) {
      System.out.println("notes.txt is empty. Add some text and try again.");

      return;
    }

    NoteBook book = new NoteBook(pages);
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Note App #1: Linked List (Prev / Next Page) ===");
    showCurrent(book);

    while (true) {
      System.out.println();
      System.out.println("[n] Next   [p] Prev   [f] First   [l] Last   [q] Quit");
      System.out.print("Choice: ");
      String input = scanner.nextLine().trim().toLowerCase();

      switch (input) {
        case "n" -> {
          if (book.hasNext()) {
            book.next();
          } else {
            System.out.println("Already on the last page.");
          }
        }
        case "p" -> {
          if (book.hasPrev()) {
            book.prev();
          } else {
            System.out.println("Already on the first page.");
          }
        }
        case "f" -> book.first();
        case "l" -> book.last();
        case "q" -> {
          System.out.println("Goodbye!");
          return;
        }
        default -> System.out.println("Invalid choice.");
      }
      showCurrent(book);
      scanner.close();
    }
  }

  private static void showCurrent(NoteBook book) {
    PageNode node = book.getCurrent();
    if (node == null) {
      System.out.println("(No pages)");
      return;
    }
    String border = "-".repeat(40);
    System.out.println(border);
    System.out.println("Page " + node.getPageNumber() + " / " + book.getSize());
    System.out.println(border);
    System.out.println(node.getContent());
    System.out.println(border);
  }
}
