import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class StudentGrades
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Sasa1", 85);
        studentGrades.put("Sasa2", 92);
        studentGrades.put("Sasa3", 78);
        studentGrades.put("Sasa4", 88);
        System.out.println("Initial list of students and their grades: ");
        printMap(studentGrades);
        studentGrades.put("Sasa3", 81);
        System.out.println("\nAfter Sasa3 assessment was updated: ");
        printMap(studentGrades);
        String studentWithLowestGrade = Collections.min(studentGrades.entrySet(), Map.Entry.comparingByValue()).getKey();
        studentGrades.remove(studentWithLowestGrade);
        System.out.println("\nAfter removing the student with the lowest grade (" + studentWithLowestGrade + "):");
        printMap(studentGrades);
    }
    private static void printMap(HashMap<String, Integer> map)
    {
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println("Student: " + entry.getKey() + ", grade: " + entry.getValue());
        }
    }
}
