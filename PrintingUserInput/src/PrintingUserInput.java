import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter strings or an empty line to end input");

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()){
                break;
            }

            list.add(input);
        }

        list.stream()
                .forEach(word -> System.out.println(word));
    }
}
