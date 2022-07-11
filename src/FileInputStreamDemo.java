import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			// File file = new File("\\Users\\gargp\\Downloads\\demo\\demo.txt"); // all three are giving same result then what is the difference
			
			// fis = new FileInputStream(file);
			// fis = new FileInputStream("\\Users\\gargp\\Downloads\\demo\\demo.txt");

			fis = new FileInputStream(new File("\\Users\\gargp\\Downloads\\demo\\demo.txt"));
			System.out.println("File opened");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				fis.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nFile closed");
	}
}
