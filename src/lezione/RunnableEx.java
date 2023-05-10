package lezione;

public class RunnableEx implements Runnable {
	private String message;

	public RunnableEx(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(message + " " + i);
		}
	}

	public class ThreadEx extends Thread {
		private String s;

		public ThreadEx(String s) {
			this.s = s;
		}

		@Override
		public void run() { // sarà il task eseguito dal thread
			for (int i = 0; i < 10; i++) {
				System.out.println(s + " " + i);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			Thread r1 = new Thread(new ThreadEx("Sono il primo"));
//			Thread r2 = new Thread(new ThreadEx("Sono il secondo"));

//			r1.start();
//			r2.start();
		}

	}
}
