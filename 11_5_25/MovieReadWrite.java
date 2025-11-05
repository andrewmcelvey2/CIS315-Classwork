
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MovieReadWrite {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = 
				new BufferedReader(
						new FileReader(
								new File("movies.txt")));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
		
		while (br.ready()) {
//			System.out.println(br.readLine());
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, ",");
			String title = st.nextToken();
			String year = st.nextToken();
			int intYear = Integer.parseInt(year);
			
//			System.out.print("Title: " + title + " in " + year);
			bw.write(title);
//			break;
		}
		
		bw.close();

	}

}
