package jashu;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		String data ="Jaswanth ,Nellore ,Andhra Pradesh";
		
		try {
			FileWriter output = new FileWriter("Jaswanth.txt");
			output.write(data);
			System.out.println("Data is writted successfully");
			output.close();
		} catch (IOException e) {
			System.out.println("File write error....");
		}

	}

}

