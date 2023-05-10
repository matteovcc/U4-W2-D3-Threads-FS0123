package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main1 {
	public static Logger logger = LoggerFactory.getLogger(Main1.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threads t1 = new Threads("*");
		Threads t2 = new Threads("#");

		t1.setName("*");
		t2.setName("#");

		t1.start();
		t2.start();

	}

}
