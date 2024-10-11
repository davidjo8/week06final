package week06Final;

public class App {
	
	public static void main(String[] args) {
	
	Deck deck = new Deck();
	Player player1 = new Player("David");
	Player player2 = new Player("Jon");
	int rounds = 26;
	
	System.out.println("Shuffling the Deck.....");
	System.out.println("Play War!!");
	
	for (int round = 1; round <= rounds; round++) {
		System.out.println("Round " + (round));
	
	deck.shuffle();
	
	Card player1Card = deck.draw();
	Card player2Card = deck.draw();
	
	System.out.println(player1.getName() + " draws: ");
	player1Card.describe();
	System.out.println(player2.getName() + " draws: ");
	player2Card.describe();
	
	
	if(player1Card.getValue() > player2Card.getValue()) {
		player1.addScore();
		System.out.println(player1.getName() + " wins the round!");
	} else if (player2Card.getValue() > player1Card.getValue()) {
		player2.addScore();
		System.out.println(player2.getName() + " wins the round!");
	} else {
		System.out.println("It's a tie this round O.O");
	}
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("Current Score - " + player1.getName() + ": " + player1.getscore() + 
					", " + player2.getName() + ": " + player2.getscore());
	}// end of for loop
	
	//Figure out who won the game
	
	System.out.println("Final Score - " + player1.getName() + ": " + player1.getscore() + 
						", " + player2.getName() + ": " + player2.getscore());
	
	if (player1.getscore() > player2.getscore()) {
		System.out.println(player1.getName() + " wins the game!");
	} else if (player2.getscore() > player1.getscore()) {
		System.out.println(player2.getName() + " wins the game!");
	} else {
		System.out.println("OMGG IT'S A DRAW!");
	}
	
	
	
	
}//end of main method
	
}//end of public class App
