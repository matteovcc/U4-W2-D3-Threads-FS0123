package lezione3;

public class Countdown {
	private int i;

	public synchronized void doCountdown() {
		for (i = 10; i > 0; i--) {
			System.out.println("i" + i);
		}
	}
}
