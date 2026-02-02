import java.util.ArrayList;

public class Scoring {

	static ArrayList<Card> play = new ArrayList<Card>();
	static ArrayList<Card> pokerHandCheck = new ArrayList<Card>();

	static int totalChips = 0;
	static int chips = 0;
	static double mult = 0.00;

	public static void evaluatePokerHands() {
		for (int i = 0; i < play.size(); i++) {
			pokerHandCheck.add(play.get(i));
		}

		// sort this seperate array so you can then figure out all the card scores
		// |-------------------------------------------------------------------------------------------------------------------------|

		for (int i = 0; i < play.size(); i++) {
			String tempRank = pokerHandCheck.get(i).getRank();
			int tempOrder = pokerHandCheck.get(i).getOrder();
			int tempValue = pokerHandCheck.get(i).getValue();
			int position = i;

			// String tempSuit = pokerHandCheck.get(i).getSuit();

			for (int j = i; j < play.size(); j++) {

				if (tempOrder > pokerHandCheck.get(j).getOrder()) {
					tempRank = pokerHandCheck.get(j).getRank();
					tempOrder = pokerHandCheck.get(j).getOrder();
					tempValue = pokerHandCheck.get(j).getValue();
					position = j;
				}
			}

			pokerHandCheck.get(position).getRank().equals(pokerHandCheck.get(i).getRank());

//					pokerHandCheck.get(position).getValue().setValue(pokerHandCheck.get(i).getValue());
//					pokerHandCheck.get(position).getOrder().setOrder( pokerHandCheck.get(i).getOrder());

		}

	}

	// |---------------------------------------------------------------------------------------------------------------------------|
	public static void cardScoring() {

		for (int i = 0; i < play.size(); i++) {
			chips = chips + play.get(i).getValue();

			if (play.get(i).getEnhanced().equals("Bonus")) 
			{
				chips = chips + 30;
			}
			else if (play.get(i).getEnhanced().equals("Mult")) 
			{
				mult = mult + 4;
			} 
			else if (play.get(i).getEnhanced().equals("Glass")) 
			{
				mult = mult * 2;
				int destroy = (int) (Math.random() * 4);
				
				if (destroy == 3) {
					play.remove(i);
				}
			} 
			else if (play.get(i).getEnhanced().equals("Lucky")) 
			{
				int luckyMult = (int) (Math.random() * 5);
				int luckyMoney = (int) (Math.random() * 15);
				if (luckyMult == 4) {
					mult = mult + 20;
				}
				if (luckyMoney == 14) 
				{
					// Add 20$ once money system is set up
				}
			}

			// add Joker effect (after card scoring) once Joker system is set up

		}

	}

}
