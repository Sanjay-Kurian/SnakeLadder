
public class RollingDice {
	public double Roll()
	{
		return Math.floor((Math.random() * 10) % 6) + 1;
	}
}
