package app;

public class Threads extends Thread {
	private String simbolo;

	public Threads(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			Main1.logger.info(" " + i + " " + simbolo);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Main1.logger.error(e.getMessage());
			}

		}
	}
}
