package lezione2;

public class AnotherThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Main.logger.info(" " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Main.logger.error(e.getMessage());
			}
		}
	}
}
