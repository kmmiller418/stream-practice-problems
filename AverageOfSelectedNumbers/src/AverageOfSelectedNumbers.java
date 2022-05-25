
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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

        while(true){
            System.out.println("Print the average of the negative numbers, the positive numbers, or all the numbers? (n/p/a)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")){
                calculateNegAvg(nums);
                break;
            } else if (input.equalsIgnoreCase("p")){
                calculatePosAvg(nums);
                break;
            } else if (input.equalsIgnoreCase("a")) {
                calculateAvg(nums);
                break;
            } else {
                System.out.println("Sorry, that isn't a valid command.");
            }
        }
    }

    public static void calculateNegAvg(ArrayList<Integer> arr){
        double average = arr.stream()
                .mapToInt(i -> i)
                .filter(num -> num < 0)
                .average()
                .getAsDouble();

        System.out.println("Average of the negative numbers: " + average);
    }

    public static void calculatePosAvg(ArrayList<Integer> arr){
        double average = arr.stream()
                .mapToInt(i -> i)
                .filter(num -> num >= 0)
                .average()
                .getAsDouble();

        System.out.println("Average of the positive numbers: " + average);
    }

    public static void calculateAvg(ArrayList<Integer> arr){
        double average = arr.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();

        System.out.println("Average of all numbers: " + average);
    }
}
