
public class MainFile {

public static void main(String[] args) {
		
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("virtualkey", "Jaswanth");
		
		HandleOptions.handleWelcomeScreenInput();
	}

}
