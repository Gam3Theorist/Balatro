import java.util.ArrayList;
import java.util.Scanner;


public class Play
	{
	static Scanner userPick = new Scanner(System.in);
	static Scanner playConfirm = new Scanner(System.in);

	static	int hands=4;
	static  int totalHands=hands;
	static	int discards=4;
	static	int handSize=7;
	

	public static ArrayList<Card> hand = new ArrayList<Card>();
	public static ArrayList<Card> discard = new ArrayList<Card>();

		public static void draw()
		{
			if(hands==hands)
				{
					for(int i=0; i<=handSize; i++)
						{
							int cardDraw = (int)(Math.random()*Deck.modifiedDeck.size());

							hand.add(Deck.modifiedDeck.get(cardDraw));
							Deck.modifiedDeck.remove(cardDraw);
							
						}
					
				
				}
			else if (hands<totalHands && hands>0)
				{
				
				for(int i=hand.size(); i<=handSize; i++)
						{
					int cardDraw = (int)(Math.random()*Deck.modifiedDeck.size());

					hand.add(Deck.modifiedDeck.get(cardDraw));
					Deck.modifiedDeck.remove(cardDraw);
					
						}
				}
			
			else
				{
					System.out.println("GAME OVER");
				//	System.exit(0);
				}
		}
		
		public static void displayHand() 
	{
			
		for(int i=0; i<hand.size(); i++)
			{
				System.out.print("| "+ hand.get(i).getRank() +" of "+ hand.get(i).getSuit() +" |");
			}
			
			System.out.print("\n");
			
			for(int i=0; i<hand.size(); i++)
				{
				System.out.print("|");
				if(i<=8)
				{
			
				
				if(hand.get(i).getRank().length()+hand.get(i).getSuit().length()==8)
				{
					System.out.print("       "+(i+1)+"      ");
				}
				else if ((hand.get(i).getRank().length()+hand.get(i).getSuit().length())==9)
				{
					System.out.print("       "+(i+1)+"       ");
				}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==10)
				{
					System.out.print("       "+(i+1)+"        ");
				}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==11)
				{
					System.out.print("        "+(i+1)+"        ");
				}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==12)
				{
					System.out.print("         "+(i+1)+"        ");
				}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==13)
				{
					System.out.print("         "+(i+1)+"         ");
				}
				System.out.print("|");
				
				}
				
				else if(i>8)
				{

					if(hand.get(i).getRank().length()+hand.get(i).getSuit().length()==8)
					{
					System.out.print("       "+(i+1)+"     ");
					}
				else if ((hand.get(i).getRank().length()+hand.get(i).getSuit().length())==9)
					{
					System.out.print("       "+(i+1)+"      ");
					}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==10)
					{
					System.out.print("       "+(i+1)+"       ");
					}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==11)
					{
					System.out.print("        "+(i+1)+"       ");
					}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==12)
					{
					System.out.print("         "+(i+1)+"       ");
					}
				else if (hand.get(i).getRank().length()+hand.get(i).getSuit().length()==13)
					{
					System.out.print("         "+(i+1)+"        ");
					}
					
				System.out.print("|");
				}
				
				}
	
	
	
	}
		
		public static void displayPlay()
		{
		
		for(int i=0; i<Scoring.play.size(); i++)
			{
				System.out.print("| "+ Scoring.play.get(i).getRank() +" of "+ Scoring.play.get(i).getSuit() +" |");
			}
			
			System.out.print("\n");
			
			for(int i=0; i<Scoring.play.size(); i++)
				{
				System.out.print("|");
				if(i<=8)
				{
			
				
				if(Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==8)
				{
					System.out.print("       "+(i+1)+"      ");
				}
				else if ((Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length())==9)
				{
					System.out.print("       "+(i+1)+"       ");
				}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==10)
				{
					System.out.print("       "+(i+1)+"        ");
				}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==11)
				{
					System.out.print("        "+(i+1)+"        ");
				}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==12)
				{
					System.out.print("         "+(i+1)+"        ");
				}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==13)
				{
					System.out.print("         "+(i+1)+"         ");
				}
				System.out.print("|");
				
				}
				
				else if(i>8)
				{

					if(Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==8)
					{
					System.out.print("       "+(i+1)+"     ");
					}
				else if ((Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length())==9)
					{
					System.out.print("       "+(i+1)+"      ");
					}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==10)
					{
					System.out.print("       "+(i+1)+"       ");
					}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==11)
					{
					System.out.print("        "+(i+1)+"       ");
					}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==12)
					{
					System.out.print("         "+(i+1)+"       ");
					}
				else if (Scoring.play.get(i).getRank().length()+Scoring.play.get(i).getSuit().length()==13)
					{
					System.out.print("         "+(i+1)+"        ");
					}
					
				System.out.print("|");
				}
				
				}
		}
	 
		public static void pick()
		{
			boolean choiceLoop =true;
			int [] pickAmount =  new int[hand.size()];
			int pick= userPick.nextInt();
			int pickLimit=0;
			String play = playConfirm.nextLine();
		
			
		while(choiceLoop ==true)
		{
		for(int i=0; i<pickAmount.length; i++)
			{
				pickAmount[i]=0;
			}
			
			if(pickAmount[pick-1]%2==1 && pickLimit<5)
			{
				Scoring.play.add(hand.get((pick-1)));
				pickLimit+=1;
				pickAmount[pick-1]+=1;
			}
			
			else if(pickAmount[pick-1]%2==0)
			{
				int removed=0;
				for(int i=0; i<Scoring.play.size(); i++)
				{
					if(Scoring.play.get(i)==hand.get(pick-1) && removed==0)
					{
						Scoring.play.remove(Scoring.play.get(i));
						removed+=1;
					}
				}
				pickLimit-=1;
				pickAmount[pick-1]+=1;
			}
			else if(play.equals("play"))
			{
				choiceLoop =false;
			}
			
		}
		}
			
	}
