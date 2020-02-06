/**
 * 
 */
package metier;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author ZH
 *
 */
public class Eleve {
	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private int age;
	private Adresse adresse;
	private static int compteur=0;

	/**
	 * 
	 */
	public Eleve() {
		// TODO Auto-generated constructor stub
		++compteur;
	}
	
	public Eleve(String nom, String prenom, LocalDate dateNaissance, Adresse adresse) {
		super();
		this.id = ++compteur;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.age = calculerAge();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	private int calculerAge() {
		// calcule l'âge à partir de la date de naissance
		// et de la date d'aujourd'hui
		int age=0;
		age = Period.between(dateNaissance,LocalDate.now()).getYears();
		return age;
	}

	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", age="
				+ age + ", adresse=" + adresse + "]\n";
	}
	
	

}
