package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		int data = 0;
		char[] readChars = new char[100];
		FileReader fr = new FileReader("c:/Dev/git/javaProject/src/FileReaderExample.java");
		FileWriter fw = new FileWriter("c:/Temp/Dir/file1.txt");
		while ((data = fr.read(readChars))!=-1) {
			System.out.println(new String(readChars));
		}
		fr.close();
		System.out.println("end...");
	}

}
