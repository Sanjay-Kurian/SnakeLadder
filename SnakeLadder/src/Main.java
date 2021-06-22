
public class Main {
	public static void main(String[] args) {
		int pos = 0;
		System.out.println("The player is starting at position "+pos);
		RollingDice dice = new RollingDice();
		System.out.println("The number on dice is "+dice.Roll());
	}
}
