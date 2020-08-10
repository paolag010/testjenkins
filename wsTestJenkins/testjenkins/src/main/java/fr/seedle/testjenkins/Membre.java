package fr.seedle.testjenkins;

public class Membre {
	
	private String nom;
	private String premon;
	
	public Membre() {
		// TODO Auto-generated constructor stub
	}

	public Membre(String nom, String premon) {
		super();
		this.nom = nom;
		this.premon = premon;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPremon() {
		return premon;
	}

	public void setPremon(String premon) {
		this.premon = premon;
	}

	@Override
	public String toString() {
		return "TestJenkins - Membre [nom=" + nom + ", premon=" + premon + "]";
	}
	
	

}
