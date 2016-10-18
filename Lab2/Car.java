package Lab2;

public class Car implements Comparable<Object> {

	private static int number = 0;
	private String model;
	private int year; 
	private double tank; 
	
	public Car(String model, int year, double tank){
		 this.model = model;
		 this.year = year;
		 this.tank = tank;
		 
		 number++;
	}
	
	public void pumpGas(double t)
	{
		tank += t;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getTank() {
		return tank;
	}

	public void setTank(double tank) {
		this.tank = tank;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Car.number = number;
	}
	
	public String display(){
		return String.format("Model:%s\tYear:%d\tTank:%.2f", getModel(), getYear(), getTank());
	}
	
	@Override
	public String toString()
	{
		String s1 ="";
		s1 = s1 + "Tank has " + tank;
		return s1;
	}

	@Override
	public int compareTo(Object o){
		
		Car c1 = (Car) o;
		double x = c1.getTank();
		
		if(x < tank){
			return -1;
		}
		
		if (x > tank ){ 
			return 1;
		}
		    				
		return 0;
	}

}
	
