package gamblingSimulation;

public class Gambler {
	static int Stake = 100;
	static int Bet = 1;
	static int win = 1;
	
public static void main(String[] args) {
	System.out.println("Gambling Simulation");
	int result = (int) (Math.random() * 10) % 2;
	if (result == win) {
		Stake++;
		System.out.println("WIN");
	} else {
		Stake--;
		System.out.println("LOSS");
	}
	System.out.println(Stake);
	}
}
