import java.util.Random;
import java.util.Scanner;

public class BlackJack {

	public static int getRandomCard(Random rand) {
		int card = rand.nextInt(10) + 2;

		return card;
	}

	public static int[] playersTurn(Random rand, Scanner scan) {
		int playerCard1;
		int playerCard2;
		int playerTotal = 0;
		int dealerCard1 = 0;
		int[] playerReturn = new int[2];
		String hit = "hit";
		String userInput;

		playerCard1 = getRandomCard(rand);
		playerCard2 = getRandomCard(rand);
		dealerCard1 = getRandomCard(rand);

		playerTotal = playerCard1 + playerCard2;

		System.out.println("You get a " + playerCard1 + " and a " + playerCard2 + ".");
		System.out.println("Your total is " + playerTotal + ".\n");
		System.out.println(
				"The dealer has a " + dealerCard1 + " showing, and a card hidden.\nHis total his hidden, too.");

		userInput = getUserInput(scan);
		do {
			if (userInput.equals(hit)) {
				playerCard1 = getRandomCard(rand);
				playerTotal = playerTotal + playerCard1;

				if (playerTotal > 21) {
					System.out.println("You busted!");
					break;
				} else {
					System.out.println("You drew a " + playerCard1);
					System.out.println("Your total is " + playerTotal);
					userInput = getUserInput(scan);
				}
			}
		} while (userInput == "hit");

		playerReturn[0] = dealerCard1;
		playerReturn[1] = playerTotal;

		return playerReturn;
	}

	public static void dealersTurn(Random rand, int dealerCard1) {
		int dealerCard2;
		int dealerTotal = 0;

		dealerCard2 = getRandomCard(rand);

		dealerTotal = dealerCard1 + dealerCard2;

		System.out.println("\nOkay, dealer's turn.");
		System.out.println("His hidden card was a " + dealerCard2 + ".");
		System.out.println("His total was " + dealerTotal);

		do {

			if (dealerTotal <= 16) {
				dealerCard2 = getRandomCard(rand);
			}

			System.out.println("\nThe dealer drew a " + dealerCard2);
			dealerTotal = dealerTotal + dealerCard2;
			System.out.println("His new total is " + dealerTotal);
		} while (dealerTotal <= 16);
	}

	public static String getUserInput(Scanner scan) {
		String userInput = "init";
		String hit = "hit";
		String stay = "stay";

		while (!userInput.equals(hit) || !userInput.equals(stay)) {
			System.out.println("\nWould you like to \"hit\" or \"stay\"?");
			userInput = scan.next();
			if (userInput.equals(hit) || userInput.equals(stay)) {
				break;
			}
		}

		return userInput;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to my blackjack program!");

		int dealerCard1[] = playersTurn(rand, scan);
		dealersTurn(rand, dealerCard1[0]);

	}
}