
public class Sort
{
	public static<T extends Comparable<T>> void BubbleSort(T[] unsorted)
	{
		T x;
		for(int i=1; i<unsorted.length; i++)
		{
			for(int j=0; j<unsorted.length-i; j++)
			{
				if(unsorted[j].compareTo(unsorted[j+1])>0)
				{
					x=unsorted[j];
					unsorted[j]=unsorted[j+1];
					unsorted[j+1]=x;
					
				}
			}
		}
	}

}
