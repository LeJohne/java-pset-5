import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a playing card: ");
        String card = (in.nextLine()).toUpperCase();

        int length = card.length();
        String suit = card.substring(1, length);
        String rank = card.substring(0,1);

        switch(suit){
            case "C":
                suit = "Clubs";
                break;
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
            case "S":
                suit = "Spades";
                break;
            default:
                suit = null;
        }

        switch(rank){
            case "2":
                rank = "Two";
                break;
            case "3":
                rank = "Three";
                break;
            case "4":
                rank = "Four";
                break;
            case "5":
                rank = "Five";
                break;
            case "6":
                rank = "Six";
                break;
            case "7":
                rank = "Seven";
                break;
            case "8":
                rank = "Eight";
                break;
            case "9":
                rank = "Nine";
                break;
            case "T":
                rank = "Ten";
                break;
            case "J":
                rank = "Jack";
                break;
            case "Q":
                rank = "Queen";
                break;
            case "K":
                rank = "King";
                break;
            case "A":
                rank = "Ace";
                break;
            default:
                rank = null;
        }

        if (rank != null && suit != null){
            System.out.println("\n" + rank + " of " + suit + ".");
        } else if (length != 2) {
            System.out.println("\nThat's not a valid card.");
        } else if (suit == null) {
            System.out.println("\nThat's not a valid suit.");
        } else if (rank == null) {
            System.out.println("\nThat's not a valid rank.");
        }

        in.close();
    }
}
