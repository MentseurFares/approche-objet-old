package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	private static final int NOM_VILLE = 6;
	private static final int CODE_DEPARTEMENT = 2;
	private static final int POPULATION_TOTALE = 9;
	private static final int LIMIT = 25_000;

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Users/ments/JavaWorkspace/utilsForPractice/recensement.csv");
		Path newPath = Paths.get("C:/Users/ments/JavaWorkspace/utilsForPractice/recensementSimplifié.csv");
		List<String> lines = Files.readAllLines(path);
		List<String> newLines = new ArrayList<>();

		for (int i = 0; i < lines.size(); i++) {
			
			String newLine = getNewLine(lines.get(i), i);
			if (newLine != null) {
				newLines.add(newLine);
			}

		}

		System.out.println("-------------------------------------------------");
		
		Files.write(newPath, newLines);
	}

	private static String getNewLine(String line, int nbLine) {
		String[] parts = line.split(";");
		if (nbLine == 0) {
			return parts[NOM_VILLE] + ";" + parts[CODE_DEPARTEMENT] + ";" + parts[POPULATION_TOTALE];
		}
		int nbHabitant = Integer.parseInt(parts[POPULATION_TOTALE].replaceAll(" ", ""));
		if (nbLine == 0 || nbHabitant > LIMIT) {
			return parts[NOM_VILLE] + ";" + parts[CODE_DEPARTEMENT] + ";" + parts[POPULATION_TOTALE];
		}
		return null;
	}

}
