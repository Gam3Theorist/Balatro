
public class Card
	{

	static	String rank;
	static	String suit;
	static	int value;
	static	String enhanced;
	static	String seal;
	static	String edition;
	
//======================================================================
		
		public Card (String r, String su, int v, String en, String se, String ed)
		{
			
		rank=r;
		suit=su;
		value=v;
		enhanced=en;
		seal=se;
		edition=ed;
		
			
		}
//======================================================================
		
		public String getRank()
			{
				return rank;
			}

		public void setRank(String rank)
			{
				this.rank = rank;
			}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}

		public String getEnhanced()
			{
				return enhanced;
			}

		public void setEnhanced(String enhanced)
			{
				this.enhanced = enhanced;
			}

		public String getSeal()
			{
				return seal;
			}

		public void setSeal(String seal)
			{
				this.seal = seal;
			}

		public String getEdition()
			{
				return edition;
			}

		public void setEdition(String edition)
			{
				this.edition = edition;
			}

	
	}
