package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		
		HashSet<String> villes  = new HashSet<>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		
		String longueVille = null;
		for (String ville : villes) {
			if(longueVille == null  || longueVille.length() < ville.length()) {
				longueVille = ville; 
			}
		}
		System.out.println(villes);
		System.out.println("Ville avec le plus long nom : "+longueVille);
		villes.remove(longueVille);
		System.out.println(villes);
	}

}
