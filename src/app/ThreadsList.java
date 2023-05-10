package app;

import java.util.List;

public class ThreadsList extends Thread {
//	public ThreadsList(List<Integer> firstList) {
//	}
//	@Override
//	public void run() {
//		for (Integer i : numeriRandom)
//	}

	private List<Integer> totalList;

	public ThreadsList(List<Integer> totalList) {
		this.totalList = totalList;
	}

	public int num = 0;

	@Override
	public void run() {
		for (Integer i : totalList) {
			num += i;
		}
		Main2.logger.info("la somma è :" + num);
	}

	public int getResult() {
		return num;
	}

}
