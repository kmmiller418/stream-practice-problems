import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers or end to complete list");

        ArrayList<Integer> nums = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            nums.add(Integer.parseInt(input));
        }
        System.out.println(positive(nums));
    }

    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> list = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return list;
    };


}
