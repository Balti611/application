package Entities;

public class Collier {
	private int ID_Collier;
	private int ID_Vache;
	private Float Temp�rature;
	private Float Pulsation;
	private Localisation Position ;
	
	 public Collier() {
			
		}

	
	public Collier(int iD_Collier, int iD_Vache, Float temp�rature, Float pulsation, Float fr�quence_Cardiaque,
			Localisation position) {
		super();
		ID_Collier = iD_Collier;
		ID_Vache = iD_Vache;
		Temp�rature = temp�rature;
		Pulsation = pulsation;
		Position = position;
	}
	public int getID_Collier() {
		return ID_Collier;
	}
	public void setID_Collier(int iD_Collier) {
		ID_Collier = iD_Collier;
	}
	public int getID_Vache() {
		return ID_Vache;
	}
	public void setID_Vache(int iD_Vache) {
		ID_Vache = iD_Vache;
	}
	public Float getTemp�rature() {
		return Temp�rature;
	}
	public void setTemp�rature(Float temp�rature) {
		Temp�rature = temp�rature;
	}
	public Float getPulsation() {
		return Pulsation;
	}
	public void setPulsation(Float pulsation) {
		Pulsation = pulsation;
	
	}
	public Localisation getPosition() {
		return Position;
	}
	public void setPosition(Localisation position) {
		Position = position;
	}

   	

}
