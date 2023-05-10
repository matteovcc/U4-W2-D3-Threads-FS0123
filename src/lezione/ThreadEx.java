package lezione;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadEx extends Thread {
	public static Logger logger = LoggerFactory.getLogger(ThreadEx.class);
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
//		Java è un linguaggio multi-threaded consente di sfruttare il meccanismo della concorrenza logica, 
//		Parti separate di un programma possono essere eseguite come se fossero processate parallelamente,potendo però accedere a spazi
//		di indirizzamento della memoria condivisi in modo da poter scambiare in modo semplice le info necessario al corretto funzionamento 
//		dell'app. Consente ad esempio di eseguire delle operazioni in background senza contstringere l'utente ad attendere il completamento
//		di tali operazione e continuare ad usare il programma
		logger.info("sono un logger");
		ThreadEx st1, st2, st3;

		st1 = new ThreadEx("primo thread");
		st2 = new ThreadEx("secondo thread");
		st3 = new ThreadEx("terzo thread");

		st1.start();
		st2.start();
		st3.start();

	}
}
