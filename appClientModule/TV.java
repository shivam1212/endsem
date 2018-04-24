public class TV 
{
	int on=0;
	int channel_no=1;
	int volume=100;
	String name="MI Smart TV";
	
	public void on()
	{
		on=0;
		System.out.println("TV On");
	}
	
	public void off()
	{
		on=1;
		System.out.println("TV Off");
	}
	
	public void next_channel()
	{
		channel_no++;
		System.out.println("Channel :"+channel_no);
	}
	
	public void previous_channel()
	{
		channel_no--;
		System.out.println("Channel :"+channel_no);
	}
	
	public void increaseVolume()
	{
		volume++;
		System.out.println("Volume :"+volume);
	}
	
	public void decreaseVolume()
	{
		volume--;
		System.out.println("Volume :"+volume);
	}
}
