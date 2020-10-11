import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int response = in.nextInt();

        if(response == 0){
            System.out.println("\nZero.");
        } else if (response < 0) {
            System.out.println("\nNegative.");
        } else {
            System.out.println("\nPositive.");
        }

        in.close();
    }
}
