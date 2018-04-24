public class WashingMachine 
{
	int on=1;
	String name="Samsung Washing Machine";
	
	public void on()
	{
		on=0;
		System.out.println("The Washing Machine is Now On");
	}
	
	public void off()
	{
		on=1;
		System.out.println("The Washing Machine is Now Off");
	}
}