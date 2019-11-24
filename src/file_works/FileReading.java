package file_works;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\thiag\\Desktop\\senha UNIT.txt");
		Scanner s = null;
		try {
			s = new Scanner(file);
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(s != null) {
				s.close();
			}
		}
		
	}

}
