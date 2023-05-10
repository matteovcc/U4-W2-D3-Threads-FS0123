package app;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main2 {

	public static Logger logger = LoggerFactory.getLogger(Main2.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3000;
		List<Integer> numeriRandom = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			numeriRandom.add((int) (Math.random() * 100));
		}

		Main2.logger.info("" + numeriRandom);
		System.out.println(numeriRandom.size());

		List<Integer> firstList = numeriRandom.subList(0, 1000);
		List<Integer> secondList = numeriRandom.subList(1000, 2000);
		List<Integer> thirdList = numeriRandom.subList(2000, 3000);

		System.out.println(firstList.size());
//		System.out.println(secondList.size());
//		System.out.println(thirdList.size());

		ThreadsList t1 = new ThreadsList(firstList);
		ThreadsList t2 = new ThreadsList(secondList);
		ThreadsList t3 = new ThreadsList(thirdList);

		// COSI FACENDO LANCERò IN MODO SEQUENZIALE NON PARALLELO
//		try {
//			t1.start();
//			t1.join();
//			t2.start();
//			t2.join();
//			t3.start();
//			t3.join();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		} 

		// COSI FACENDO I THREAD VENGONO LANCIATI CONTEMPORANEAMNTE E POI SI ASPETTA CHE
		// TUTTI TERMINO

		try {
			t1.start();
			t2.start();
			t3.start();
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		int result = t1.getResult() + t2.getResult() + t3.getResult();
		Main2.logger.info(" " + result);

	}

}
