import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        if(year > 0) {
            if (((year % 4 == 0) && (year % 100 > 0)) || ((year % 100 == 0) && (year % 400 == 0))) {
                System.out.println(("\n" + year + " is a leap year."));
            } else {
                System.out.println(("\n" + year + " is not a leap year."));
            }
        }

        in.close();


    }
}