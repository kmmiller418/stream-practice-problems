import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Input numbers or 'end' to stop.");
        while(true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")){
                break;
            }

            nums.add(Integer.valueOf(input));
        }

        double average = nums.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);

    }
}
