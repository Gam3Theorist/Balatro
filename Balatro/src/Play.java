import java.util.ArrayList;
public class Play
	{

	static	int hands=4;
	static	int discards=4;
	static	int handSize=8;

	static ArrayList<Card> hand = new ArrayList<Card>();

		public static void draw()
		{
			if(hands>0)
				{
					for(int i=hand.size(); i<=handSize; i++)
						{
							int pick = (int)(Math.random()*Deck.modifiedDeck.size());

							hand.add(Deck.modifiedDeck.get(pick));
							Deck.modifiedDeck.remove(pick);
						}
				
				}
			else
				{
					System.out.println("GAME OVER");
				//	System.exit(0);
				}
		}
		
	
		
		
		
		
	}
