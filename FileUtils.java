/**
SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
Timestamp timestamp = new Timestamp(System.currentTimeMillis());
String fileName = "file_"+sdf.format(timestamp);
*/
package learn;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileUtils {
	private Formatter formatter;
	private File file;
	private static String extension = ".txt";
	private Scanner readFile;

	public void createFile(String filePath, String fileName) {
		file = new File(filePath + "/" + fileName + extension);
		try {
			if (file.exists()) {
				System.out.println("File " + fileName + extension + " already exists!");
			} else {
				formatter = new Formatter(file);
				System.out.println("File " + fileName + extension + " created!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void writeIntoFile(String text) {
		if (!file.canRead())
			System.out.println("can not read this file!");
		else
			formatter.format("%s\n", text);
			formatter.close();
	}
	
	public void readFile() {
		try {
			readFile = new Scanner(new File(file.toString()));
			while (readFile.hasNext()) {
				String fileContent = readFile.next();
				System.out.printf("%s \n", fileContent);
			}
			readFile.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}