
public class competence {
	
	private String nom;
	private String description;
	private String type;
	private String nature;
	private int levelMax;
	private float tempsIncantation;
	
	public competence(String nom, String description, String type, String nature, int levelMax, float tempsIncantation) {
		// TODO Auto-generated constructor stub
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getType() {
		return type;
	}
	public void setTypeDeCompetence(String type) {
		this.type = type;
	}
	
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	
	public int getLevelMax() {
		return levelMax;
	}
	public void setLevelMax(int levelMax) {
		this.levelMax = levelMax;
	}
	
	public float getTempsIncantation() {
		return tempsIncantation;
	}
	public void setTempsIncantation(float tempsIncantation) {
		this.tempsIncantation = tempsIncantation;
	}
	
	
}
