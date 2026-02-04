import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{

	public static ArrayList<Card> deck = new ArrayList<Card>();
	public static ArrayList<Card> modifiedDeck = new ArrayList<Card>();
	 
	
	public static void fillDeck()
		{
	deck.add(new Card("Ace",13, "hearts", 11, "none", "none", "none"));  //  8   |   3        |||     8     9    10    11    12    13    
	deck.add(new Card("Ace",13, "clubs", 11, "none", "none", "none"));   //  5   |   4
	deck.add(new Card("Ace",13, "spades", 11, "none", "none", "none"));  //  6   |   5
	deck.add(new Card("Ace",13, "diamonds", 11, "none", "none", "none"));
	deck.add(new Card("King",12, "hearts", 10, "none", "none", "none"));
	deck.add(new Card("King",12, "clubs", 10, "none", "none", "none"));
	deck.add(new Card("King",12, "spades", 10, "none", "none", "none"));
	deck.add(new Card("King",12, "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("Queen",11, "hearts", 10, "none", "none", "none"));
	deck.add(new Card("Queen",11, "clubs", 10, "none", "none", "none"));
	deck.add(new Card("Queen",11, "spades", 10, "none", "none", "none"));
	deck.add(new Card("Queen",11, "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("Jack",10, "hearts", 10, "none", "none", "none"));
	deck.add(new Card("Jack",10, "clubs", 10, "none", "none", "none"));
	deck.add(new Card("Jack",10, "spades", 10, "none", "none", "none"));
	deck.add(new Card("Jack",10, "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("Ten",9, "hearts", 10, "none", "none", "none"));
	deck.add(new Card("Ten",9, "clubs", 10, "none", "none", "none"));
	deck.add(new Card("Ten",9, "spades", 10, "none", "none", "none"));
	deck.add(new Card("Ten",9, "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("Nine",8, "hearts", 9, "none", "none", "none"));
	deck.add(new Card("Nine",8, "clubs", 9, "none", "none", "none"));
	deck.add(new Card("Nine",8, "spades", 9, "none", "none", "none"));
	deck.add(new Card("Nine",8, "diamonds", 9, "none", "none", "none"));
	deck.add(new Card("Eight",7, "hearts", 8, "none", "none", "none"));
	deck.add(new Card("Eight",7, "clubs", 8, "none", "none", "none"));
	deck.add(new Card("Eight",7, "spades", 8, "none", "none", "none"));
	deck.add(new Card("Eight",7, "diamonds", 8, "none", "none", "none"));
	deck.add(new Card("Seven",6, "hearts", 7, "none", "none", "none"));
	deck.add(new Card("Seven",6, "clubs", 7, "none", "none", "none"));
	deck.add(new Card("Seven",6, "spades", 7, "none", "none", "none"));
	deck.add(new Card("Seven",6, "diamonds", 7, "none", "none", "none"));
	deck.add(new Card("Six",5, "hearts", 6, "none", "none", "none"));
	deck.add(new Card("Six",5, "clubs", 6, "none", "none", "none"));
	deck.add(new Card("Six",5, "spades", 6, "none", "none", "none"));
	deck.add(new Card("Six",5, "diamonds", 6, "none", "none", "none"));
	deck.add(new Card("Five",4, "hearts", 5, "none", "none", "none"));
	deck.add(new Card("Five",4, "clubs", 5, "none", "none", "none"));
	deck.add(new Card("Five",4, "spades", 5, "none", "none", "none"));
	deck.add(new Card("Five",4, "diamonds", 5, "none", "none", "none"));
	deck.add(new Card("Four",3, "hearts", 4, "none", "none", "none"));
	deck.add(new Card("Four",3, "clubs", 4, "none", "none", "none"));
	deck.add(new Card("Four",3, "spades", 4, "none", "none", "none"));
	deck.add(new Card("Four", 3, "diamonds", 4, "none", "none", "none"));
	deck.add(new Card("Three", 2, "hearts", 3, "none", "none", "none"));
	deck.add(new Card("Three", 2, "clubs", 3, "none", "none", "none"));
	deck.add(new Card("Three",  2,"spades", 3, "none", "none", "none"));
	deck.add(new Card("Three", 2, "diamonds", 3, "none", "none", "none"));
	deck.add(new Card("Two", 1,"hearts", 2, "none", "none", "none"));
	deck.add(new Card("Two", 1,"clubs", 2, "none", "none", "none"));
	deck.add(new Card("Two", 1,"spades", 2, "none", "none", "none"));
	deck.add(new Card("Two", 1, "diamonds", 2, "none", "none", "none"));
	}
	
		
	public static void shuffleDeck()
	{
		Collections.shuffle(modifiedDeck);
		
	}
	
	public static void fillModifiedDeck()
	{
			
		for(int i=0; i< deck.size(); i++)
			{
				
				modifiedDeck.add(deck.get(i));
				
				
			}
		
	}
	
	}

