package Lab2;

public class Bag<T> implements BagInterface<T> {
	private int size;
	private T item;
	private T item2;
	int numOfItems = 0;
	
	public void display()
	{
		System.out.println("Item: " + item);
		if (numOfItems > 1)
			System.out.println("Second Item: " + item2);
		
		System.out.println("Number of Items: " + numOfItems + "\n");
	}
	
	public void add(T it)
	{
		if (numOfItems == 0)
		{
			item = it;
		    numOfItems++;
		}
		
		else if (numOfItems == 1)
		{
			item2 = it;
		    numOfItems++;
		}
}
	//removes an item
	public T remove()
	{
		return item;
	}
	
	/*@Override
	public String toString()
	{
		String s1 = "";
		s1 = s1 + "Value of size is " + size;
		s1 = s1 + item;
		return s1;
	}*/
}
