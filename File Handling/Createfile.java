package jashu;
import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) {
		File myFile = new File("Jaswanth.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("File Successfully Created...");
			}
			else {
				System.out.println("File creation error...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
