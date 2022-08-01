package practiceproject.phase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readtofile {
	public static void main(String[] args) {
		try {
			File file = new File("c://temp//testFile.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch(FileNotFoundException e) {
		  System.out.println("Error has occured");
		  e.printStackTrace();
			
		}
	}

}



