package fr.seedle.testjenkins.test;

import org.junit.Test;

import fr.seedle.testjenkins.Service;

public class TestMembre {

	@Test
	public void execute() {
		Service service = new Service();
		if (service.getMembre().getNom() == null) {
			throw new RuntimeException("impossible de poursuivre sans nom de membre");
		}
	}

}
