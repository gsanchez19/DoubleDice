
public class DiceTwo {

	static Dice die1 = new Dice();
	static Dice die2 = new Dice();
	static int numrolls = 0;
	public DiceTwo()
	{
		
	}

	public static String roll(int target)
	{
		int targetRoll = target;
		boolean rolling = true;		
		int roll1 = 0;
		int roll2 = 0;
		while(rolling)
		{
			roll1 = die1.roll();
			roll2 = die2.roll();

			
			if(roll1 + roll2 != targetRoll)
			{
				numrolls = numrolls + 1;
				
			}
			
			else if(roll1 + roll2 == targetRoll) 
			{
				numrolls = numrolls + 1;
				rolling = false; 
			}
			
			}
		return "Final rolled: " + roll1 + " and " + roll2 +". Took total of " + numrolls +" rolls.";
			

		
		}
	public int getNumRolls()
	{
		return numrolls;
	}













}
