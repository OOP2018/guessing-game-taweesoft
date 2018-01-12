
public class GameSolver {
	public int play(NumberGame game) {
		System.out.println( game.toString() );
		
		// This is just an example.
		System.out.println( game.getMessage() );
		System.out.print("Your answer? ");
		
		int lastHigh = game.getUpperBound();
		int guessNumber = (int)(Math.ceil(lastHigh/2));
		boolean correct = false;
		while(!correct) {
			correct = game.guess(guessNumber);
			String message = game.getMessage();
			System.out.println("My Guess = " + guessNumber);
			System.out.println(message);
			System.out.println("--------");
			if(message.contains("small")) {
				guessNumber = (int)Math.ceil((lastHigh + guessNumber)/2);
			}else {
				lastHigh = guessNumber;
				guessNumber -= (int)Math.ceil(guessNumber/2);
			}
		}
		return guessNumber;
	}
}
