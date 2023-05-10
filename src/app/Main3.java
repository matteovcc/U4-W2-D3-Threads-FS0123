package app;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main3 {
	private static File file = new File("infoEx.txt");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			saveOnDisk("Mario Rossi@5");
			saveOnDisk("Giorgio Bianchi@7");
			saveOnDisk("Gianni Verdi@7");

			System.out.println("Ecco il contenuto");
			System.out.println(readFileFromDisk());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void saveOnDisk(String string) throws IOException {
		FileUtils.writeStringToFile(file, string + System.lineSeparator(), "UTF-8", true);

	}

	public static String readFileFromDisk() throws IOException {
		if (file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF-8");
			return content;
		} else {
			System.out.println("File non trovato");
			return " ";
		}
	}

}
