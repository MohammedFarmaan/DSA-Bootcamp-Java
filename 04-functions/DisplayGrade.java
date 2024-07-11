import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int marks = in.nextInt();

        System.out.println(switchGradeMarks(marks));
    }
    static String switchGradeMarks(int marks){
        return switch (marks / 10) {
            case 9 -> "AA";
            case 8, 7 -> "A";
            case 6 -> "B";
            case 5 -> "C";
            default -> "Fail";
        };
    }

    static String gradeMarks(int mark){
        if(mark >= 91 && mark <= 100){
            return "AA";
        }
        if(mark >= 81 && mark <= 90){
            return "AB";
        }
        if(mark >= 71 && mark <= 80){
            return "BB";
        }
        if(mark >= 61 && mark <= 70){
            return "BC";
        }
        if(mark >= 51 && mark <= 60){
            return "CD";
        }
        if(mark >= 41 && mark <= 50){
            return "DD";
        } else {
            return "Fail";
        }
    }
}
