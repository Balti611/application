package Entities;

import java.util.Date;

public class V�t�rinaire extends Utilisateur {
	
	private String Adresse;
	private int Note;
	public V�t�rinaire() {
	
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getNote() {
		return Note;
	}
	public void setNote(int note) {
		Note = note;
	}
	@Override
	public String toString() {
		return "V�t�rinaire [Adresse=" + Adresse + ", Note=" + Note + "]";
	}
	public V�t�rinaire(String adresse, int note) {
		super();
		Adresse = adresse;
		Note = note;
	}
	
}
