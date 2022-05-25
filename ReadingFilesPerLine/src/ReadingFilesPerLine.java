import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file name:");

        read(scanner.nextLine());
    }

    public static List<String> read(String file){
        List<String> doc = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .forEach(line -> doc.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return doc;
    }

}
