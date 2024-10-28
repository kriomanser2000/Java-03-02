import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by a space: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        List<Integer> numberList = new ArrayList<>();
        for (String number : numbers)
        {
            numberList.add(Integer.parseInt(number));
        }
        Set<Integer> numberSet = new HashSet<>(numberList);
        List<Integer> uniqueNumberList = new ArrayList<>(numberSet);
        System.out.println("List of numbers without duplicates: ");
        for (int num : uniqueNumberList)
        {
            System.out.print(num + " ");
        }
    }
}
