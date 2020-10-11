import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = (in.nextLine()).toUpperCase();

        switch (grade){
            case "A+":
                System.out.println("\nYour GPA is 4.00.");
                break;
            case "A":
                System.out.println("\nYour GPA is 4.00.");
                break;
            case "A-":
                System.out.println("\nYour GPA is 3.67.");
                break;
            case "B+":
                System.out.println("\nYour GPA is 3.33.");
                break;
            case "B":
                System.out.println("\nYour GPA is 3.00.");
                break;
            case "B-":
                System.out.println("\nYour GPA is 2.67.");
                break;
            case "C+":
                System.out.println("\nYour GPA is 2.33.");
                break;
            case "C":
                System.out.println("\nYour GPA is 2.00.");
                break;
            case "C-":
                System.out.println("\nYour GPA is 1.67.");
                break;
            case "D+":
                System.out.println("\nYour GPA is 1.33.");
                break;
            case "D":
                System.out.println("\nYour GPA is 1.00.");
                break;
            case "D-":
                System.out.println("\nYour GPA is 0.67.");
                break;
            case "F":
                System.out.println("\nYour GPA is 0.00.");
                break;
            default:
                System.out.println("\nThat's not a valid letter grade.");
                break;
        }

        in.close();
    }
}