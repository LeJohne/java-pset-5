import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int response = in.nextInt();

        if(response % 2 == 0){
            System.out.println("\nEven.");
        } else {
            System.out.println("\nOdd.");
        }

        in.close();
    }
}