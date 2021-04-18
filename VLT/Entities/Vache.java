package Entities;

public class Vache {
	private int ID_Vache;
	private int ID_Agri;
	private int ID_V�t;
	private String Race ;
	private int Age ;
	private String Sexe ;
	private String Vaccin ;
	private String Dossie_M�dical ;
	private boolean P�riode_Chaleur ;
	private int num�ro;
	public Vache() {
		
	}
	public int getID_Vache() {
		return ID_Vache;
	}
	public void setID_Vache(int iD_Vache) {
		ID_Vache = iD_Vache;
	}
	public int getID_Agri() {
		return ID_Agri;
	}
	public void setID_Agri(int iD_Agri) {
		ID_Agri = iD_Agri;
	}
	public int getID_V�t() {
		return ID_V�t;
	}
	public void setID_V�t(int iD_V�t) {
		ID_V�t = iD_V�t;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	public String getVaccin() {
		return Vaccin;
	}
	public void setVaccin(String vaccin) {
		Vaccin = vaccin;
	}
	public String getDossie_M�dical() {
		return Dossie_M�dical;
	}
	public void setDossie_M�dical(String dossie_M�dical) {
		Dossie_M�dical = dossie_M�dical;
	}
	public boolean isP�riode_Chaleur() {
		return P�riode_Chaleur;
	}
	public void setP�riode_Chaleur(boolean p�riode_Chaleur) {
		P�riode_Chaleur = p�riode_Chaleur;
	}
	public int getNum�ro() {
		return num�ro;
	}
	public void setNum�ro(int num�ro) {
		this.num�ro = num�ro;
	}
	@Override
	public String toString() {
		return "Vache [ID_Vache=" + ID_Vache + ", ID_Agri=" + ID_Agri + ", ID_V�t=" + ID_V�t + ", Race=" + Race
				+ ", Age=" + Age + ", Sexe=" + Sexe + ", Vaccin=" + Vaccin + ", Dossie_M�dical=" + Dossie_M�dical
				+ ", P�riode_Chaleur=" + P�riode_Chaleur + ", num�ro=" + num�ro + "]";
	}
	public Vache(int iD_Vache, int iD_Agri, int iD_V�t, String race, int age, String sexe, String vaccin,
			String dossie_M�dical, boolean p�riode_Chaleur, int num�ro) {
		super();
		ID_Vache = iD_Vache;
		ID_Agri = iD_Agri;
		ID_V�t = iD_V�t;
		Race = race;
		Age = age;
		Sexe = sexe;
		Vaccin = vaccin;
		Dossie_M�dical = dossie_M�dical;
		P�riode_Chaleur = p�riode_Chaleur;
		this.num�ro = num�ro;
	}
	
	


}
