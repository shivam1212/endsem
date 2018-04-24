public class HASInterface 
{
	Object[][] arr=new Object[10][2];
	int no_devices=0;
	Owner owner=new Owner();
	
	public HASInterface(String string) 
	{
		
	}

	public void addDevices(String string)
	{
	if(string=="TV")
	{
		arr[no_devices][0]=new TV();
		arr[no_devices][1]="TV";
		no_devices++;
	}
	
	if(string=="AC")
	{
		//AC Code Here!	
	}
	
	if(string=="Lights")
	{
		//Lights Code Here!
	}
	
	if(string=="Washing_Machine")
	{
		//Washing Machine Here!	
	}
	
}
	/* 
	public void displayInterface()
	{
		System.out.println("Owner: "+owner.getName());
		for(int i=0;i<no_devices;i++)
		{
			if(arr[i][1]=="TV")
			{
				System.out.println("Device Added:"+(TV)arr[i][0].name);
			}
			
			if(arr[i][1]=="AC")
			{
				System.out.println("Device Added:"+(AC)arr[i][0].name);
			}
				
			if(arr[i][1]=="Lights")
			{
				System.out.println("Device Added:"+(Lights)arr[i][0].name);
			}
				
			if(arr[i][1]=="WashingMachine")
			{
				System.out.println("Device Added:"+(WashingMachine)arr[i][0].name);
			}
		}
	}
	*/
	
}
