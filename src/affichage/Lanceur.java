package affichage;

import domaine.Personne;
import service.PersonneImpl;

public class Lanceur {

	public static void main(String[] args) {
		Personne p =new Personne(1, "Labidouille", "Tommy", 12);
		PersonneImpl sP = new PersonneImpl();
		sP.ajouter(p);

	}

}
