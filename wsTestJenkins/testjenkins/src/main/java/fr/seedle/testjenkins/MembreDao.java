package fr.seedle.testjenkins;

public class MembreDao {

	
	public static Membre getMembre() {
		Membre membre = new Membre();
		membre.setPremon("Eric");
		membre.setNom("R");
		return membre;
	}
	
}
