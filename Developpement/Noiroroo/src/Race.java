import java.util.Vector;


public class Race {
	private String name; 
	private String description;
	private Vector<Double> statPerception;
	private Vector< Vector< Double> > statBrute;
	private Vector<Vector <String>> competences;
	
	public Race(String name, String description, Vector<Double> statPerception, Vector< Vector< Double> > statBrute, Vector<Vector <String>> competences){
		this.name = name;
		this.statPerception = statPerception;
		this.statBrute = statBrute;
		this.competences = competences;
		this.description = description;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public Double getPrecision() {
		return statPerception.get(0);
	}

	public void setPrecision(Double precision) {
		this.statPerception.set(0, precision);
	}

	public Double getChance() {
		return statPerception.get(1);
	}

	public void setChance(Double chance) {
		this.statPerception.set(1, chance);
	}

	public Double getEsquive() {
		return statPerception.get(2);
	}

	public void setEsquive(Double esquive) {
		this.statPerception.set(2, esquive);
	}

	public Double getHabilité() {
		return statPerception.get(3);
	}

	public void setHabilite(Double habilite) {
		this.statPerception.set(3, habilite);
	}

	public Double getIntelligence() {
		return statPerception.get(4);
	}

	public void setIntelligence(Double intelligence) {
		this.statPerception.set(4, intelligence);
	}
	
	public Double getEndurance() {
		return statPerception.get(5);
	}

	public void setEndurance(Double endurance) {
		this.statPerception.set(5, endurance);
	}

	public Double getFurtivité() {
		return statPerception.get(6);
	}

	public void setFurtivite(Double furtivite) {
		this.statPerception.set(6, furtivite);
	}

	public Double getCharisme() {
		return statPerception.get(7);
	}

	public void setCharisme(Double charisme) {
		this.statPerception.set(7, charisme);
	}

	public Vector<Double> getVie() {
		return statBrute.get(0);
	}

	public void setVie(Vector<Double> vie) {
		this.statBrute.set(0, vie);
	}

	public Vector<Double> getForce() {
		return statBrute.get(1);
	}

	public void setForce(Vector<Double> force) {
		this.statBrute.set(1, force);
	}

	public Vector<Double> getRapidite() {
		return statBrute.get(2);
	}

	public void setRapidite(Vector<Double> rapidite) {
		this.statBrute.set(2, rapidite);
	}

	public Vector<Double> getDexterite() {
		return statBrute.get(3);
	}

	public void setDexterite(Vector<Double> dexterite) {
		this.statBrute.set(3, dexterite);
	}

	public Vector<Double> getResistance() {
		return statBrute.get(4);
	}

	public void setResistance(Vector<Double> resistance) {
		this.statBrute.set(4, resistance);
	}

	public Vector<Double> getEsprit() {
		return statBrute.get(5);
	}

	public void setEsprit(Vector<Double> esprit) {
		this.statBrute.set(5, esprit);
	}
	
	public Vector<Double> getDeplacement() {
		return statBrute.get(6);
	}

	public void setDeplacement(Vector<Double> deplacement) {
		this.statBrute.set(6, deplacement);
	}
	
	public Vector<Double> getStatPerception() {
		return statPerception;
	}

	public void setStatPerception(Vector<Double> statPerception) {
		this.statPerception = statPerception;
	}

	public Vector<Vector<Double>> getStatBrute() {
		return statBrute;
	}

	public void setStatBrute(Vector<Vector<Double> > statBrute) {
		this.statBrute = statBrute;
	}

	public Vector<Vector <String>> getCompetences() {
		return competences;
	}
	
	public Vector<String> getAllNameCompetences() {
		Vector<String> newVector = new Vector<String>();
		for (int i = 0; i < competences.size(); i++) 
			newVector.add(competences.get(i).get(0));
		
		return newVector;
	}
	
	public Vector<Double> getAllXP() {
		Vector<Double> newVector = new Vector<Double>();
		for (int i = 0; i < competences.size(); i++) 
			newVector.add(Double.parseDouble(competences.get(i).get(1)));
		
		return newVector;
	}
	
	public Vector<String> getCompetenceAndXpByNumber(int i){
		return competences.get(i);
	}

	public void setCompetences(Vector<Vector <String>> competences) {
		this.competences = competences;
	}
}