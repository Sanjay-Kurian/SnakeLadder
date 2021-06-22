
public class Main {
	public static void main(String[] args) {
		double pos = 0;
		RollingDice dice = new RollingDice();
		Options opt = new Options();
		while (pos<=20)
		{
			double roll = dice.Roll();
			System.out.println("The number on dice is "+roll);
			if (opt.Option() == 0)
			{
				System.out.println("No play");
				System.out.println("The player position is "+pos);
			}
			else if (opt.Option() == 1)
			{
				pos = pos + roll;
				System.out.println("Ladder");
				System.out.println("The player position is "+pos);
			}
			else
			{
				pos = pos - roll;
				if (pos<0)
				{
					pos=0;
				}
				System.out.println("Snake");
				System.out.println("The player position is "+pos);
			}
			
		}
	}
}
