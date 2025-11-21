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
					for(int i=0; i<=handSize; i++)
						{
							int pick = (int)(Math.random()*Deck.deck.size());
						
					hand.add(Deck.deck.get(pick));
									
							
						}
				
				}
			else
				{
					//end the game
				}
		}
		
	
		
		
		
		
	}
