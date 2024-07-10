import java.util.Scanner;

public class CalculateCgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      CGPA = (Total Percentage ÷ Total Semesters) ÷ 9.5
        int totalPercentage = in.nextInt();
        int totalSemesters = in.nextInt();

        double cgpa =((totalPercentage/totalSemesters)/9.5) * 10;

        System.out.println(cgpa);
    }
}
