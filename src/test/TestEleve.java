package test;

import java.time.LocalDate;

import donnees.EleveService;
import metier.Adresse;
import metier.Eleve;

public class TestEleve {

	public TestEleve() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adresse1 = new Adresse(5, "rue Hegel", 59160, "Lomme", "France");
		Adresse adresse2 = new Adresse(7, "rue Galilée", 59160, "Lomme", "France");
		Adresse adresse3 = new Adresse(6, "rue des Oliviers", 93160, "Noisy le Grand", "France");
		Adresse adresse4 = new Adresse(63, "rue Gambetta", 59000, "Lille", "France");
		Adresse adresse5 = new Adresse(45, "boulevard République", 59160, "Lille", "France");
		
		Eleve eleve1 = new Eleve("Pierre", "Jacques", LocalDate.of(1996, 4, 23), adresse1);
		Eleve eleve2 = new Eleve("Keskes", "Taoufik", LocalDate.of(1972,11,26), adresse3);
		Eleve eleve3 = new Eleve("Paul", "Jacques", LocalDate.of(1993, 6, 9), adresse2);
		Eleve eleve4 = new Eleve("Lucile", "Jacques", LocalDate.of(1999, 4, 28), adresse4);
		Eleve eleve5 = new Eleve("Lucie", "Jacques", LocalDate.of(1992, 4, 23), adresse5);
		
		EleveService es = new EleveService();
		
		es.create(eleve1);
		es.create(eleve2);
		es.create(eleve3);
		es.create(eleve4);
		es.create(eleve5);
		
		System.out.println(es.findAll());
		
		es.delete(eleve2);
		System.out.println("\non a supprimé Tao \n");
		System.out.println(es.findAll());
		
		eleve1.setAdresse(new Adresse(7, "rue Copernic", 59160, "Lomme", "France"));
		
		es.update(eleve1);
		System.out.println("\non a modifié l'adresse de Pierre\n");
		System.out.println(es.findAll());
	}

}
