
import java.io.File;
import java.util.*;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.nfl.Quarterback;

public class FunWithCollections {

	public static void main(String[] args) {

		Quarterback[] backs = readFile("nfl_offensive_stats.csv");
		
		System.out.println(backs.length);
		
		Map<String, Quarterback> starters = new HashMap<String, Quarterback>();
		
//		starters.put("asdf", new Quarterback("7", "Elway", "Broncos", 0));
		
		for (Quarterback qb : backs) {
			starters.put(qb.getName(), qb);
		}
		
		System.out.println(starters);
		System.out.println(starters.size());
		System.out.println(starters.get("Nick Foles "));
		
		Set names = starters.keySet();
		System.out.println(names);
		
		Set<Quarterback> qbs = new HashSet<>();
		for (Quarterback qb : backs) {
			qbs.add(qb);
		}
		
		System.out.println(qbs);
		
		Queue<Quarterback> rotation = new LinkedList<Quarterback>();
		
		for (Quarterback qb : backs) {
			if (qb.getTeam().equals("TEN")) {
				System.out.println(qb);
				rotation.add(qb);
			}
		}
		
		System.out.println(rotation);
		
//		while(true) {
//			System.out.println(rotation.remove());
//		}
		
		

	}

	private static Quarterback[] readFile(String filename) {
		// Create array to return
		Quarterback[] backs = new Quarterback[100];

		// Create a File instance
		File file = new File(filename);

		try {
			// Create a Scanner for the file
			Scanner input = new Scanner(file);

			// Skip header
			if (input.hasNext()) {
				input.nextLine();
			}

			int i = 0;

			// Read data from a file
			while (input.hasNext()) {
				String line = input.nextLine();
				StringTokenizer st = new StringTokenizer(line, ",");

				String gameId = st.nextToken();
				String playerId = st.nextToken();
				String position = st.nextToken();
				String player = st.nextToken();
				String team = st.nextToken();
				String passCompletions = st.nextToken();
				String passAttempts = st.nextToken();
				String passingYards = st.nextToken();

				if (position.equals("QB")) {
					backs[i++] = new Quarterback(playerId, player, team, Integer.parseInt(passingYards));
				}

				if (i == 100)
					break;
			}

			// Close the file
			input.close();
		} catch (FileNotFoundException fnfe) {
			throw new RuntimeException(fnfe);
		}

		return backs;
	}
}
