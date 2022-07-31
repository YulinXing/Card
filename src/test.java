
public class test {

	public static void main(String[] args) 
	{
		Card c1=new Card("heart",1);
		Card c2=new Card("spade",2);
		Card c3=new Card("heart",10);
		Card c4=new Card("club",3);
		Card c5=new Card("diamond",13);
		Card c6=new Card("spade",6);
		
		Card[] arr={c1,c2,c3,c4,c5,c6};
		
		Sort.BubbleSort(arr);

		
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k].getSuit() + arr[k].getSequence());
		}
		

	}

}
