package lezione2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	public static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnotherThread t1 = new AnotherThread();
		AnotherThread t2 = new AnotherThread();
		AnotherThread t3 = new AnotherThread();

		t1.setName("primo");
		t2.setName("secondo");
		t3.setName("terzo");

		t1.start();
		t2.start();
		t3.start();

		t3.interrupt();
	}

}
