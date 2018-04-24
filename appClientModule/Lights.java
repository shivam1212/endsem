public class Lights 
{
	int on=1;
	String name="All Lights";
	public void on()
	{
		on=0;
		System.out.println("Lights On");
	}
	
	public void off()
	{
		on=1;
		System.out.println("Lights Off");
	}
}

