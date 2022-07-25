package jashu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {

	public static void main(String[] args) throws IOException {
		char[] data = new char[100];
		try {
			FileReader input = new FileReader("Jaswanth.txt");
			input.read(data);
			System.out.println("data is available from a file");
			System.out.println(data);
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("file read error...");
		}
		
	}
}


