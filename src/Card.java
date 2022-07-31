
public class Card implements Comparable<Card>
{
	private String suit;
	private int sequence;
	
	public Card(String suit, int sequence)
	{
		this.suit=suit;
		this.sequence=sequence;
	}

	public String getSuit()
	{
		return suit;
	}

	public void setSuit(String suit) 
	{
		this.suit = suit;
	}

	public int getSequence()
	{
		return sequence;
	}

	public void setSequence(int sequence) 
	{
		this.sequence = sequence;
	}


	@Override
	public int compareTo(Card o) 
	{
		if(this.sequence==2 && o.sequence!=2)
		{
			return 1;
		}
		else if(this.sequence==1 && o.sequence!=2 && o.sequence!=1)
		{
			return 1;
		}
		if(this.sequence!=2 && o.sequence==2)
		{
			return -1;
		}
		else if(this.sequence!=1 && this.sequence!=2 && o.sequence==1)
		{
			return -1;
		}
		else if(this.sequence > o.sequence)
		{
			return 1;
		}
		else if(this.sequence < o.sequence)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
}
