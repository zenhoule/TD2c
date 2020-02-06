package metier;

/**
 * @author ZH
 *
 */
public class Adresse {
	private int numRue;
	private String nomRue;
	private int codePostal;
	private String ville;
	private String pays;

	public Adresse() {
		// TODO Auto-generated constructor stub
	}
	

	public Adresse(int numRue, String nomRue, int codePostal, String ville, String pays) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
	


	public Adresse(int codePostal, String ville) {
		super();
		this.codePostal = codePostal;
		this.ville = ville;
	}


	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}


	@Override
	public String toString() {
		return "Adresse [numRue=" + numRue + ", nomRue=" + nomRue + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", pays=" + pays + "]";
	}
	
	

}
