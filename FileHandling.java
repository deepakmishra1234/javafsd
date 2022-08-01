package practiceproject.phase1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.io.FileWriter;
public class FileHandling {


	public static void createFileUsingFileClass() throws IOException {
		File file = new File("c://temp//testFile.txt");
		
		//create the file
		if(file.createNewFile()) {
			System.out.println("File has been created!");
		}else {
			System.out.println("file exists");
			
		}
		
		//Write content
		FileWriter writer = new FileWriter(file);
		writer.write("Fetch data");
		writer.close();	
	}
	private static void createFileUsingFileOutputStreamClass() throws IOException
	{
		String data = "Fetch data";
		FileOutputStream out = new FileOutputStream("c://temp//testFile2.txt");
		out.write(data.getBytes());
		out.close();
	}
	private static void createFileIN_NIO() throws IOException
	{
		String data = "Fetch data";
		Files.write(Paths.get("c://temp//testFile3.txt"), data.getBytes());
		List<String> lines = Arrays.asList("1st line", "2nd line");
	 Files.write(Paths.get("file6.txt"),
			 lines,
			 StandardCharsets.UTF_8,
			 StandardOpenOption.CREATE,
			 StandardOpenOption.APPEND);	}
	
	
	public static void main(String[] args) throws IOException{
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		createFileIN_NIO();
		
	}
	
	
	

}
