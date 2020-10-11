import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double grade = Math.round(in.nextDouble());

        if(grade > 100){
            System.out.println("\nGrades above 100 are invalid.");
        } else if (grade <= 100 && grade >= 90){
            System.out.println("\nYou received an A.");
        } else if (grade <= 89 && grade >= 80){
            System.out.println("\nYou received a B.");
        } else if (grade <= 79 && grade >= 70){
            System.out.println("\nYou received a C.");
        } else if (grade <= 69 && grade >= 60){
            System.out.println("\nYou received a D.");
        } else if (grade <= 59 && grade >= 0){
            System.out.println("\nYou received an F.");
        } else if (grade < 0) {
            System.out.println("\nGrades below 0 are invalid.");
        }

        in.close();
    }
}