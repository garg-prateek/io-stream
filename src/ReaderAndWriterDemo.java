import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader("/Users/gargp/Downloads/demo/demo.txt");
		fw = new FileWriter("/Users/gargp/Downloads/demo/demo1.txt");

		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();

	}
}
