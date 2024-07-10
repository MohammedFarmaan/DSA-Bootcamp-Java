import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalMarks = in.nextInt();
        int totalSubjects = in.nextInt();

        int avgMarks = totalMarks/totalSubjects;
        System.out.println(avgMarks);
    }
}
