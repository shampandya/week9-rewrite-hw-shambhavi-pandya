package week9_program;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme using if else and while loop. (Week-7 Homework)
 */
public class Prog2_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading output from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String name = scan.next();
        System.out.println("Enter Student Roll number");
        int rollNo = scan.nextInt();
        System.out.println("Enter marks of subject math: ");
        int mathMarks = scan.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100 ");
            System.out.println("Please enter correct mark of the Maths: ");
            mathMarks = scan.nextInt();
        }
        System.out.println("Enter marks of subject Science");
        int sciMarks = scan.nextInt();
        while (sciMarks < 0 || sciMarks > 100) {
            System.out.println("Invalid Input. Please enter marks between 0 to 100 ");
            System.out.println("Please enter correct marks of the science: ");
            sciMarks = scan.nextInt();
        }
        System.out.println("Enter marks of Subject English: ");
        int engMarks = scan.nextInt();
        while (engMarks < 0 || engMarks > 100) {
            System.out.println("Invalid Input. Please enter marks between 0 to 100");
            System.out.println("Please enter the correct marks of English");
            engMarks = scan.nextInt();
        }
        int total = sum(mathMarks, sciMarks, engMarks);

        scan.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathMarks, int sciMarks, int engMarks) {
        if (mathMarks < 35 || sciMarks < 35 || engMarks < 35) {
            return "FAIL";
        } else
            return "PASS";
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("PASS")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("|----------------------------------------|");
        System.out.println("|             MARK SHEET                 |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Name          : " + name + "           |");
        System.out.println("| Roll No       : " + rollNum + "        |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Subjects      :   Marks                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Math          : " + mathsMarks + "     |");
        System.out.println("| Science       : " + scienceMarks + "   |");
        System.out.println("| English       : " + englishMarks + "   |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Total         : " + total + "          |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Percentage    : " + percentage + "     |");
        System.out.println("| Result    : " + result + "             |");
        System.out.println("| Grade    : " + grade + "               |");
        System.out.println("|----------------------------------------|");
    }

}

