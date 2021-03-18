package IO;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		File file = new File("C:/Temp/Dir/namelist.txt");
		FileWriter fw = new FileWriter(file, true);
		
		System.out.println("이름>");
		fw.write();
		
	}

}
