import java.util.*;

public class Balatro
	{

		public static void main(String[] args)
			{
			
				Deck.fillDeck();
				Deck.fillModifiedDeck();
				Deck.shuffleDeck();

				Play.draw();
				Play.displayHand();
				Play.pick();
				Play.displayPlay();

				
			}

	}
