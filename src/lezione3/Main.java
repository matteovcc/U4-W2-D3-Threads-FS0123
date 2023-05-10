package lezione3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Countdown c = new Countdown();

		CountdownThread t1 = new CountdownThread(c);
		CountdownThread t2 = new CountdownThread(c);

		t1.start();
		t2.start();

		while (t1.isAlive()) {
			t2.interrupt();
		}

	}

}
