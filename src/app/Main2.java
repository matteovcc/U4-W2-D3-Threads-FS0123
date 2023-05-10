package app;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3000;
		List<Integer> numeriRandom = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			numeriRandom.add((int) (Math.random() * 100));
		}

		System.out.println(numeriRandom);
		System.out.println(numeriRandom.size());

		List<Integer> firstList = numeriRandom.subList(0, 1000);
		List<Integer> secondList = numeriRandom.subList(1000, 2000);
		List<Integer> thirdList = numeriRandom.subList(2000, 3000);

		System.out.println(firstList.size());

		ThreadsList t1 = new ThreadsList();
		ThreadsList t2 = new ThreadsList();
		ThreadsList t3 = new ThreadsList();

	}

}
