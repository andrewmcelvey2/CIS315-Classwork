import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import imdb.Movie;

public class WebPageGenerator {
	
	private static List<Movie> readMovies(String filename) {
		List<Movie> all = new ArrayList<Movie>();
		
		Movie bullitt = new Movie("Bullitt", 1969);
		all.add(bullitt);
		
		try (BufferedReader br = new BufferedReader(new FileReader("movies.txt"))) {
			while (br.ready()) {
//				System.out.println(br.readLine());
				String line = br.readLine();
				String[] columns = line.split(",");
				String title = columns[0];
				int year;
				
				try {
					year = Integer.parseInt(columns[1]);
				} catch (NumberFormatException nfe) {
					continue;
				}
				
				Movie movie = new Movie(title, year);
				all.add(movie);
				
//				for (String column : columns) {
////					System.out.println(column);
//				}
//				break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return all;
	}
	

	public static void main(String[] args) {
		
		// try w/ resources use PrintWriter to create index.html
		try (PrintWriter pw = new PrintWriter("C:\\Users\\hmcelvey\\Desktop\\index.html")) {

		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h2>Movies</h2>");
		pw.println("<ul>");
		pw.println("<li>Jaws 1975</li>");
		
		List<Movie> movies = readMovies("movies.txt");
		for (Movie movie : movies) {
			pw.println("<li>" + movie + "</li>");
		}
		
		pw.println("</ul>");
		pw.println("</body>");
		pw.println("</html>");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

}
