package Entities;

import java.util.Date;

public class Utilisateur {
	private int ID;
	private String Nom; 
	private String Pr�nom;
	private Date DateNaiss;
    private	int Age;
	private String Email;
	private int NumT�l;
	public Utilisateur() {
			}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPr�nom() {
		return Pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		Pr�nom = pr�nom;
	}
	public Date getDateNaiss() {
		return DateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		DateNaiss = dateNaiss;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getNumT�l() {
		return NumT�l;
	}
	public void setNumT�l(int numT�l) {
		NumT�l = numT�l;
	}
	@Override
	public String toString() {
		return "Utilisateur [ID=" + ID + ", Nom=" + Nom + ", Pr�nom=" + Pr�nom + ", DateNaiss=" + DateNaiss + ", Age="
				+ Age + ", Email=" + Email + ", NumT�l=" + NumT�l + "]";
	}
	public Utilisateur(int iD, String nom, String pr�nom, Date dateNaiss, int age, String email, int numT�l) {
		super();
		ID = iD;
		Nom = nom;
		Pr�nom = pr�nom;
		DateNaiss = dateNaiss;
		Age = age;
		Email = email;
		NumT�l = numT�l;
	}
	
	
}

