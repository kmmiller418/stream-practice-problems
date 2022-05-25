
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a file:");
        System.out.println(readBooks(scanner.nextLine()));

    }

    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(book -> book.split(","))
                    .map(params -> new Book(params[0], Integer.valueOf(params[1]), Integer.valueOf(params[2]), params[3]))
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }

}
