package map;

public class Pays {

	private String name;
	private int nbHabitantM;
	private String continet;

	public Pays(String name, int nbHabitantM, String continet) {
		super();
		this.name = name;
		this.nbHabitantM = nbHabitantM;
		this.continet = continet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbHabitantM() {
		return nbHabitantM;
	}

	public void setNbHabitantM(int nbHabitantM) {
		this.nbHabitantM = nbHabitantM;
	}

	public String getContinet() {
		return continet;
	}

	public void setContinet(String continet) {
		this.continet = continet;
	}

}
