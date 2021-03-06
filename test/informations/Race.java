package informations;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import parsing.*;

public class Race {
	Vector<String> fileContenant;
	private String name;
	private String description;
	// vecteur regroupant toute les statistique de perception : Precision, Chance, Esquive, Habilite, Inteligence, Furtivite, Charisme
	private Vector<Integer> statPerception;
	// Vecteur regroupant toutes les statistiques Brute : Vie, Force, Rapidite, Dexterite, Resistance, Esprit, Deplacement
	private Vector<Vector<String>> statBrute;
	// Vecteur regroupant toutes les competences possibles avec le nombre de point d'exp besoin
	private Vector<Vector<String>> competences;

	private String apparence;
	// classe conseille par le maitre de jeu avec cette classe
	private String bestClass;
	// niveau de joueur conseille (ex : experimente)
	private String access;

	
	public Race(String name, String description, Vector<Integer> statPerception, Vector<Vector<String>> statBrute,
			Vector<Vector<String>> competences, String apparence, String bestClass, String access) {
		this.name = name;
		this.statPerception = statPerception;
		this.statBrute = statBrute;
		this.competences = competences;
		this.description = description;
		this.apparence = apparence;
		this.bestClass = bestClass;
		this.access = access;
	}
	
	public Race(String nameFile) {
		Vector<String> fileContenant = ParsingFile.readFile(nameFile);
		name = fileContenant.get(0);
		statPerception =ParsingVector.stringToInt(ParsingString.split(fileContenant.get(1), ";"));	
		statBrute = ParsingString.split2time(fileContenant.get(2), ";", ",");
		competences =ParsingString.split2time(fileContenant.get(3), ";", ",");
		description = fileContenant.get(4);
		apparence = fileContenant.get(5);
		bestClass = fileContenant.get(6);
		access = fileContenant.get(7);
	}

	private void setPerception(){
		Vector<Vector<Integer>> afterParse =ParsingVector.vectOfVectstringToInteger(ParsingString.split2time(fileContenant.get(1), ";", ","));
		

	}
	
	/////////////  getter //////////
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	//getter pour les statistiques de perceptions
	
	public Integer getPrecision() {
		return statPerception.get(0);
	}

	public Integer getChance() {
		return statPerception.get(1);
	}

	public Integer getEsquive() {
		return statPerception.get(2);
	}

	public Integer getHabilite() {
		return statPerception.get(3);
	}


	public Integer getIntelligence() {
		return statPerception.get(4);
	}

	public Integer getEndurance() {
		return statPerception.get(5);
	}

	public Integer getFurtivite() {
		return statPerception.get(6);
	}

	public Integer getCharisme() {
		return statPerception.get(7);
	}

	
	// getter pour les statistique Brutes
	
	public Vector<String> getVie() {
		return statBrute.get(0);
	}

	public Vector<String> getForce() {
		return statBrute.get(1);
	}

	public Vector<String> getRapidite() {
		return statBrute.get(2);
	}

	public Vector<String> getDexterite() {
		return statBrute.get(3);
	}

	public Vector<String> getResistance() {
		return statBrute.get(4);
	}

	public Vector<String> getEsprit() {
		return statBrute.get(5);
	}

	public Vector<String> getDeplacement() {
		return statBrute.get(6);
	}

	public Vector<Integer> getStatPerception() {
		return statPerception;
	}


	public Vector<Vector<String>> getStatBrute() {
		return statBrute;
	}

	// getter pour les compétences
	public Vector<Vector<String>> getCompetences() {
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

	public Vector<String> getCompetenceAndXpByNumber(int i) {
		return competences.get(i);
	}
	
	
	// getter pour les notes du maitre de jeu
	public String getAccess() {
		return access;
	}
	
	public String getApparence() {
		return apparence;
	}
	
	public String getBestClass() {
		return bestClass;
	}
	
	
	////////////// parsing des fichiers ///////////////
	
}
