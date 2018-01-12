import java.util.Random;

public class MyGame extends NumberGame {
	private int upperbound;
	private int secret;
	
	public MyGame() {
		this(100);
	}
	
	public MyGame(int upperbound) {
		this.upperbound = upperbound;
		this.secret = randomSecret();
		setMessage("Guess a secret number 1 to " + upperbound);
	}
	
	public int randomSecret() {
		long seed = System.nanoTime(); 
		Random rand = new Random(seed);
		// don't just copy this.
		// random.nextInt(n) returns a random integer between 0 and n-1, inclusive.
		return rand.nextInt(Math.max(this.upperbound-10,1)) + 10;
	}
	
	public boolean guess(int number) {
		if(number == this.secret) {
			setMessage("Correct!, The answer is " + this.secret);
			return true;
		}else if(number < this.secret) {
			setMessage("Sorry!, too small");
		}else if(number > this.secret) {
			setMessage("Sorry!, too large");
		}
		
		return false;
	}
	
	public int getUpperBound() {
		return this.upperbound;
	}
	
	public String toString() {
		return "Guess my number!!";
	}
}
