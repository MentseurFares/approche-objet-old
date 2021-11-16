package sets;

public class Pays {
	private String name;
	private double populationM;
	private double pib;

	public Pays(String name, double nbHabitants, double pib) {
		super();
		this.name = name;
		this.populationM = nbHabitants;
		this.pib = pib;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}

	public double getPopulationM() {
		return populationM;
	}

	public void setPopulationM(double populationM) {
		this.populationM = populationM;
	}

}
