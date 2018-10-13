// Author @ Gabe Sanchez. Created October 13, 2018. Period 7, AP Comp Sci.
import java.util.Scanner;
public class DiceTwoMain {
	
	public static void main(String[]args) {
		Scanner rollT = new Scanner(System.in);
		boolean prompting = true;
		while(prompting)
		{
			System.out.println("What number is your target? (2 - 12):");
			int target = rollT.nextInt();
			if(target < 2 || target > 12)
			{
				System.out.println("Error: Only a target number between 2 and 12. Try again.");
			}
			else
			{
				prompting = false;
				System.out.print(DiceTwo.roll(target));
			}
		
		}
	

	
	
	
	


	}
}
