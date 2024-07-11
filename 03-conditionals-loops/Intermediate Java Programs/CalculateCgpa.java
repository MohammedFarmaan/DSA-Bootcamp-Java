import java.util.Scanner;

public class CalculateCgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      CGPA = (Total Percentage ÷ Total Semesters) ÷ 9.5
        int totalPercentage = in.nextInt();
        int totalSemesters = in.nextInt();
        System.out.println(cgpa(totalPercentage, totalSemesters));
//        double cgpa =((totalPercentage/totalSemesters)/9.5) * 10;
//
//        System.out.println(cgpa);
    }
    static int cgpa(int tp, int ts){
        return (int) (((tp/ts)/9.5 ) * 10);
    }
}
