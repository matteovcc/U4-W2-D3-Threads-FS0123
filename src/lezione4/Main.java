package lezione4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {
	private static File file = new File("info.txt");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			saveOnDisk();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void saveOnDisk() throws IOException {
		FileUtils.writeStringToFile(file, "sono un esempio" + System.lineSeparator(), "UTF-8", true);
	}

}
