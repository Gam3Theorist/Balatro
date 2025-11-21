import java.util.ArrayList;

public class Deck
	{

	public static ArrayList<Card> deck = new ArrayList<Card>();
	public static ArrayList<Card> modifiedDeck = new ArrayList<Card>();
	
	public static void fillDeck()
		{
	deck.add(new Card("ace", "hearts", 11, "none", "none", "none"));
	deck.add(new Card("ace", "clubs", 11, "none", "none", "none"));
	deck.add(new Card("ace", "spades", 11, "none", "none", "none"));
	deck.add(new Card("ace", "diamonds", 11, "none", "none", "none"));
	deck.add(new Card("king", "hearts", 10, "none", "none", "none"));
	deck.add(new Card("king", "clubs", 10, "none", "none", "none"));
	deck.add(new Card("king", "spades", 10, "none", "none", "none"));
	deck.add(new Card("king", "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("queen", "hearts", 10, "none", "none", "none"));
	deck.add(new Card("queen", "clubs", 10, "none", "none", "none"));
	deck.add(new Card("queen", "spades", 10, "none", "none", "none"));
	deck.add(new Card("queen", "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("jack", "hearts", 10, "none", "none", "none"));
	deck.add(new Card("jack", "clubs", 10, "none", "none", "none"));
	deck.add(new Card("jack", "spades", 10, "none", "none", "none"));
	deck.add(new Card("jack", "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("ten", "hearts", 10, "none", "none", "none"));
	deck.add(new Card("ten", "clubs", 10, "none", "none", "none"));
	deck.add(new Card("ten", "spades", 10, "none", "none", "none"));
	deck.add(new Card("ten", "diamonds", 10, "none", "none", "none"));
	deck.add(new Card("nine", "hearts", 9, "none", "none", "none"));
	deck.add(new Card("nine", "clubs", 9, "none", "none", "none"));
	deck.add(new Card("nine", "spades", 9, "none", "none", "none"));
	deck.add(new Card("nine", "diamonds", 9, "none", "none", "none"));
	deck.add(new Card("eight", "hearts", 8, "none", "none", "none"));
	deck.add(new Card("eight", "clubs", 8, "none", "none", "none"));
	deck.add(new Card("eight", "spades", 8, "none", "none", "none"));
	deck.add(new Card("eight", "diamonds", 8, "none", "none", "none"));
	deck.add(new Card("seven", "hearts", 7, "none", "none", "none"));
	deck.add(new Card("seven", "clubs", 7, "none", "none", "none"));
	deck.add(new Card("seven", "spades", 7, "none", "none", "none"));
	deck.add(new Card("seven", "diamonds", 7, "none", "none", "none"));
	deck.add(new Card("six", "hearts", 6, "none", "none", "none"));
	deck.add(new Card("six", "clubs", 6, "none", "none", "none"));
	deck.add(new Card("six", "spades", 6, "none", "none", "none"));
	deck.add(new Card("six", "diamonds", 6, "none", "none", "none"));
	deck.add(new Card("five", "hearts", 5, "none", "none", "none"));
	deck.add(new Card("five", "clubs", 5, "none", "none", "none"));
	deck.add(new Card("five", "spades", 5, "none", "none", "none"));
	deck.add(new Card("five", "diamonds", 5, "none", "none", "none"));
	deck.add(new Card("four", "hearts", 4, "none", "none", "none"));
	deck.add(new Card("four", "clubs", 4, "none", "none", "none"));
	deck.add(new Card("four", "spades", 4, "none", "none", "none"));
	deck.add(new Card("four", "diamonds", 4, "none", "none", "none"));
	deck.add(new Card("three", "hearts", 3, "none", "none", "none"));
	deck.add(new Card("three", "clubs", 3, "none", "none", "none"));
	deck.add(new Card("three", "spades", 3, "none", "none", "none"));
	deck.add(new Card("three", "diamonds", 3, "none", "none", "none"));
	deck.add(new Card("two", "hearts", 2, "none", "none", "none"));
	deck.add(new Card("two", "clubs", 2, "none", "none", "none"));
	deck.add(new Card("two", "spades", 2, "none", "none", "none"));
	deck.add(new Card("two", "diamonds", 2, "none", "none", "none"));
	}
		
	
	
	public static void fillModifiedDeck()
	{
			
		for(int i=0; i< deck.size(); i++)
			{
				
				modifiedDeck.add(deck.get(i));
				
				
			}
		for(int i=0; i< deck.size(); i++)
			{
				
				System.out.println(modifiedDeck.get(i).getRank());
				
				
			}
		
	}
	
	}

