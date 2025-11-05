import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpg {
	
	private static void readBinary(String filename) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		FileOutputStream fos = new FileOutputStream("copy.jpg");

		int data = fis.read();

		while (data != -1) {
			fos.write(data);
			data = fis.read();
		}
		
		fis.close();
		
		fos.flush();
		fos.close();
	}

	public static void main(String[] args) throws IOException {
		readBinary("javaio.jpg");

	}

}
