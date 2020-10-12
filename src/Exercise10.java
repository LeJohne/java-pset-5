import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter wage: ");
        double wage = in.nextDouble();

        System.out.print("Enter hours worked: ");
        double hrs = in.nextDouble();

        DecimalFormat deci = new DecimalFormat("###,###,###.00");

        double total;

        if (wage < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
        } else if (hrs  < 0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0.");
        } else {
            if (hrs > 40){
                double extrahrs;
                extrahrs = (hrs - 40.0) * (wage * 1.5);
                total = (wage * 40)+ extrahrs;

            } else {
                total = wage * hrs;

            }
            System.out.println("\nYou'll make $" + deci.format(total) + " this week.");
        }

        in.close();
    }
}