package informations;

import java.util.Vector;

import statistiques.*;

public class Personnage {

	
	private String name;
	private Integer sexe;
	private Race race;
	private Classe classe;
	private StatistiquePerception perception;
	private StatistiqueBrutePersonnage brute;
	private Integer exp = 1200;
	private Vector<Competence> compList = new Vector<Competence>();
	

	
	public Personnage(String name, Integer sexe, Race race, Classe classe,Vector<Competence> compList ) 
	{
		this.name = name;
		this.sexe = sexe;
		this.race = race;
		this.classe = classe;
		this.compList = compList; 
		perception = new StatistiquePerception(classe.getStatPerception(), race.getStatPerception());
		brute = new StatistiqueBrutePersonnage(classe.getStatBrute(), race.getStatBrute());
	}
	
	public Personnage(String name, Integer sexe, Race race, Classe classe) 
	{
		this.name = name;
		this.sexe = sexe;
		this.race = race;
		this.classe = classe;
		perception = new StatistiquePerception(classe.getStatPerception(), race.getStatPerception());
		brute = new StatistiqueBrutePersonnage(classe.getStatBrute(), race.getStatBrute());
	}
	
	public void addCompetence(Competence comp)
	{
		compList.add(comp);
	}
	
	public void removeCompetence(Competence comp)
	{
		compList.remove(comp);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sexe
	 */
	public Integer getSexe() {
		return sexe;
	}

	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(Integer sexe) {
		this.sexe = sexe;
	}

	/**
	 * @return the race
	 */
	public Race getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(Race race) {
		this.race = race;
	}

	/**
	 * @return the classe
	 */
	public Classe getClasse() {
		return classe;
	}

	/**
	 * @param classe the classe to set
	 */
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	/**
	 * @return the perception
	 */
	public StatistiquePerception getPerception() {
		return perception;
	}

	/**
	 * @param perception the perception to set
	 */
	public void setPerception(StatistiquePerception perception) {
		this.perception = perception;
	}

	/**
	 * @return the brute
	 */
	public StatistiqueBrutePersonnage getBrute() {
		return brute;
	}

	/**
	 * @param brute the brute to set
	 */
	public void setBrute(StatistiqueBrutePersonnage brute) {
		this.brute = brute;
	}

	/**
	 * @return the exp
	 */
	public Integer getExp() {
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(Integer exp) {
		this.exp = exp;
	}

	/**
	 * @return the compList
	 */
	public Vector<Competence> getCompList() {
		return compList;
	}

	/**
	 * @param compList the compList to set
	 */
	public void setCompList(Vector<Competence> compList) {
		this.compList = compList;
	}
	
	
}
