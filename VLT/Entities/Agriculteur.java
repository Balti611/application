package Entities;

public class Agriculteur {

	
	private String Adresse;
	private int Score ;
	private int R�gion;
	
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public int getR�gion() {
		return R�gion;
	}
	public void setR�gion(int r�gion) {
		R�gion = r�gion;
	}
	@Override
	public String toString() {
		return "Agriculteur [Adresse=" + Adresse + ", Score=" + Score + ", R�gion=" + R�gion + "]";
	}
	public Agriculteur(String adresse, int score, int r�gion) {
		super();
		Adresse = adresse;
		Score = score;
		R�gion = r�gion;
	} 
	
	
}
