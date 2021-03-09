package exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("list.txt")) {
			int readByte = -1;
			while ((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}

		} catch (FileNotFoundException e) {//list.txt를 읽어오는 예외처리
			e.printStackTrace();
		} catch (IOException e) {//fis.read의 예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("end of prog");

	}
}
