import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers.");

        System.out.print("\nEnter integer: ");
        int response1 = in.nextInt();
        System.out.print("Enter integer: ");
        int response2 = in.nextInt();
        System.out.print("Enter integer: ");
        int response3 = in.nextInt();

        if((response1 < response2) && (response2 < response3)){
            System.out.println("\nStrictly increasing.");
        } else if((response1 < response2) && (response2 == response3 ) || ((response2 < response3) && (response1 ==response2))){
            System.out.println("\nIncreasing.");
        } else if ((response1 == response2) && (response2 == response3)){
            System.out.println("\nSame.");
        } else if((response1 > response2) && (response2 > response3)){
            System.out.println("\nStrictly decreasing.");
        } else if((response1 > response2) && (response2 == response3 ) || ((response2 > response3) && (response1 ==response2))){
            System.out.println("\nDecreasing.");
        } else {
            System.out.println("\nUnordered.");
        }

        in.close();
    }
}