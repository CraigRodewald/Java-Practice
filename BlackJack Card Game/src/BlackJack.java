import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// Initialize variables
		double playerMoney = 100.00;
		Scanner userInput = new Scanner(System.in);
		// Welcome message
		Display.welcomeMessage();
		
		// Create our playing deck
		Deck playingDeck = new Deck();
		playingDeck.createFullDeck();
		playingDeck.shuffle();
		// Create a deck for the player
		Deck playerDeck = new Deck();
		
		Deck dealerDeck = new Deck();
		
		// Game Loop
		while (playerMoney > 0) {
			// Play on
			// Take the player's bet
			System.out.println("You have $" + playerMoney + ", how much would you like to bet?");
			double playerBet = userInput.nextDouble();
			if (playerBet > playerMoney) {
				System.out.println("You cannot bet more than you have.  Please leave.");
				break;
			}
			
			boolean endRound = false;
			
			// Start dealing
			// Player gets two cards
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			//Dealer gets two cards
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			while(true){
				System.out.println("Your hand:");
				System.out.println(playerDeck.toString());
				System.out.println("Your deck is valued at:" + playerDeck.cardsValue());
				
				// Display Dealer Hand
				System.out.println("Dealer Hand: " + dealerDeck.getCard(0).toString() + " and [hidden]");
				
				// What does the player want to do
				System.out.println("Would you like to (1) hit or (2) stay");
				int response = userInput.nextInt();
				
				//They hit
				if (response == 1) {
					playerDeck.draw(playingDeck);
					System.out.println("You draw a:" + playerDeck.getCard(playerDeck.deckSize()-1).toString());
					
					// Bust if over 21
					if (playerDeck.cardsValue() > 21) {
						System.out.println("Bust! Currently valued at:" + playerDeck.cardsValue());
						playerMoney -= playerBet;
						endRound = true;
						break;
					}
				}
				
				if(response == 2){
					break;
				}
			}
			
			// Reveal dealers cards
			System.out.println("Dealer Cards: " + dealerDeck.toString());
			// See id dealer has more points than player
			if((dealerDeck.cardsValue() > playerDeck.cardsValue())&& endRound == false){
				System.out.println("Dealer beats you!");
				playerMoney -= playerBet;
				endRound = true;
			}
			// Dealer draws at 16, stays at 17+
			while((dealerDeck.cardsValue() < 17)&& endRound == false){
				dealerDeck.draw(playingDeck);
				System.out.println("Dealer draws: " + dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
			}
			
			//Display total value for Dealer
			System.out.println("Dealer's hand is valued at: " + dealerDeck.cardsValue());
			// Determine if dealer busted
			if ((dealerDeck.cardsValue() > 21)&& endRound == false) {
				System.out.println("Dealer busts! You win.");
				playerMoney += playerBet;
				endRound = true;
			}
			
			// Determine push
			if ((playerDeck.cardsValue()== dealerDeck.cardsValue()) && endRound == false) {
				System.out.println("Push");
				endRound = true;
			}
			
			if ((playerDeck.cardsValue() > dealerDeck.cardsValue())&& endRound == false) {
				System.out.println("You win the hand!");
				playerMoney += playerBet;
				endRound = true;
			}
			else if (endRound == false) {
				System.out.println("You use the hand.");
				playerMoney -= playerBet;
				endRound = true;
			}
			
			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			System.out.println("End of hand.");
		}
		
		System.out.println("Game over!  You are out of money. :(");
		userInput.close();
	}
}
