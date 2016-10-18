package Lab2;

public class Main {

//	public static <T> void show(T it)
//	{
//	   System.out.println(it);
//	}
	
	public static void main(String[] args) {
		
		BagInterface<String> b1 = new Bag<String>();
		BagInterface<Car> c = new Bag<Car>();
		
		b1.add("Pineapple");
		b1.add("Apple");
		b1.display();
		
		Car c1 = new Car("LEXUS", 2015, 5.5);
		Car c2 = new Car("BMW", 2016, 7.5);
		
		c.add(c1);
		c.add(c2);
		c.display();
	
		
		}
	}
