import java.util.Scanner;

class Guesser
{
	int guesserGuessNum ;
	
	public int GuessNum()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Guesser Please Guess the Number");
		guesserGuessNum = sc.nextInt();
		return guesserGuessNum;
	}
}

class Player 
{
	int PguessNum;
	
	public int PlayerGuessTheNum()
	{
		System.out.println("Player Guess the Num");
		Scanner sc= new Scanner(System.in);
		PguessNum = sc.nextInt();
		return PguessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromP1;
	int numFromP2;
	int numFromP3;
	
	public void collectNumFromGuesser()
	{
		Guesser g =new Guesser();
		numFromGuesser = g.GuessNum();
		
	}
	
	public void collectNumFromPlayer()
	{
		Player p1= new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromP1 = p1.PlayerGuessTheNum();
		numFromP2 = p2.PlayerGuessTheNum();
		numFromP3 = p3.PlayerGuessTheNum();
	}
	
	
	
	public void Compare() 
	{
	
		if(numFromGuesser ==numFromP1 ) 
		{
			 if (numFromGuesser == numFromP2 && numFromGuesser ==numFromP3 )
			{
				System.out.println("All player Guessed correctly");
			}
			 else if (numFromGuesser ==numFromP2 )
			 {
				 System.out.println("Player 1 and 2 guessed correctly");
			 }
			 else if (numFromGuesser == numFromP3)
			 {
				 System.out.println("Player 1 and 3 guessed correctly");
			 }
			 else {
			System.out.println("Player 1 won");
		}
		}
		
		
			else if(numFromGuesser ==numFromP2 )
		{
				 if (numFromGuesser == numFromP1 && numFromGuesser ==numFromP3 )
					{
						System.out.println("All player Guessed correctly");
					}
					 else if (numFromGuesser ==numFromP1 )
					 {
						 System.out.println("Player 1 and 2 guessed correctly");
					 }
					 else if (numFromGuesser == numFromP3)
					 {
						 System.out.println("Player 2 and 3 guessed correctly");
					 }
					 else {
					System.out.println("Player 2 won");
		}
		}
		else if (numFromGuesser ==numFromP3)
			{
				 if (numFromGuesser == numFromP1 && numFromGuesser ==numFromP3 )
					{
						System.out.println("All player Guessed correctly");
					}
					 else if (numFromGuesser ==numFromP1 )
					 {
						 System.out.println("Player 1 and 2 guessed correctly");
					 }
					 else if (numFromGuesser == numFromP3)
					 {
						 System.out.println("Player 2 and 3 guessed correctly");
					 }
					 else {
					System.out.println("Player 3 won");
		}
		}
		
		else 
		{
			System.out.println("Game Lost try again");
		}
		
	}
}

public class GuesserPractice {

	public static void main(String[] args) {
		

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();	
		u.Compare();
	}

}
