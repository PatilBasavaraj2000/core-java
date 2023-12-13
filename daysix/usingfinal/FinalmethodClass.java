package daysix.usingfinal;

public class FinalmethodClass {
	
	//constructor
	FinalmethodClass()
	{
		System.out.println("This is default ");
	}

	final int a = 100;//final
	
	final void show() //final method
	{
		System.out.println("value of a is " +a);
	}
}