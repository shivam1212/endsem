public class AC 
{

	int on=1;
	int initial_temp=28;
	String name="LG Air_Condition";
	
	public void on()
	{
		on=0;
		System.out.println("AC On");
	}
	
	public void off()
	{
		on=1;
		System.out.println("AC Off");
	}
	
	public void increaseTemp()
	{
		initial_temp++;
		System.out.println("Temperature is:"+initial_temp);
		
	}
	
	public void decreaseTemp()
	{
		initial_temp--;
		System.out.println("Temperature is:"+initial_temp);
		
	}
		
}
