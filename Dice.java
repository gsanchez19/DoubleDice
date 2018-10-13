
public class Dice {



int numrolls = 0;
private int rollnum = 0;

	public Dice()
	{
		
	}
	
	public int roll()
	{	
		rollnum = (int)((Math.random() * (7)));
		numrolls = numrolls + 1;
		if(rollnum == 0)
		{
			return rollnum + 1;
		}
		else
			{
			return rollnum;
			}
		
	}

	public int getNumRolls() 
	{
		return numrolls;
	}
	
	public void reset() 
	{
	numrolls = 0;	
	}























}