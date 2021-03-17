package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutExample {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("c:/Temp/Dir/cap.PNG");
		FileOutputStream fos = new FileOutputStream("c:/Temp/Dir/copy.PNG");
		int data = 0, cnt=0;
		while((data = fis.read())!=-1) {
			fos.write(data);
			cnt++;
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("end.........."+cnt);
		
	}

}
