package jashu;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	public static void main(String[] args) {
		String file ="data appended";
		try {
			FileWriter output = new FileWriter("Jaswanth.txt",true);
			output.write(file);
			System.out.println("data appended successfully..");
			output.close();
		} catch (IOException e) {
			System.out.println("file append error ...");

}
	}
}
