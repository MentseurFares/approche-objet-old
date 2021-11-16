package sets;

import java.util.HashSet;

public class TestPays {
	public static void main(String[] args) {
		HashSet<Pays> pays = new HashSet<>();
		pays.add(new Pays("USA", 329.5, 55_805.204 ));
		pays.add(new Pays("France", 68.014, 42_878));
		pays.add(new Pays("Allemagne", 83.149, 45_888.423));
		pays.add(new Pays("UK", 67_886, 43_770.688));
		pays.add(new Pays("Italie", 60.359, 42_080));
		pays.add(new Pays("Japon", 125.507, 39_058.5));
		pays.add(new Pays("Chine", 1_411.78, 17.104));
		pays.add(new Pays("Russie", 146.780, 24_026));
		pays.add(new Pays("Inde", 1_45678, 0));
		
	}
}
