import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String temp = in.nextLine();

        int length = temp.length();
        String tempnum = temp.substring(0, length - 2);
        int tempvalue = Integer.valueOf(tempnum);

        String unit = temp.substring(length - 1, length);

        if (unit.equals("C") || unit.equals("c")) {
            if (tempvalue < 0) {
                System.out.println("\nSolid.");
            } else if (tempvalue >= 0 && 100 >= tempvalue) {
                System.out.println("\nLiquid.");
            } else if (100 < tempvalue) {
                System.out.println("\nGas.");
            }
        } else if (unit.equals("F") || unit.equals("f")) {
            if (tempvalue < 32) {
                System.out.println("\nSolid.");
            } else if (tempvalue >= 32 && 212 >= tempvalue) {
                System.out.println("\nLiquid.");
            } else if (212 < tempvalue) {
                System.out.println("\nGas.");
            }

            in.close();
        }
    }
}