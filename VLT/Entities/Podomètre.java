package Entities;

import java.util.Date;

public class Podom�tre {
	private int ID_Pod;
	private int ID_Vache;
	private Float Distance ;
	private Date P�riode;
	
	public Podom�tre() {
		
	}
	public int getID_Pod() {
		return ID_Pod;
	}
	public void setID_Pod(int iD_Pod) {
		ID_Pod = iD_Pod;
	}
	public int getID_Vache() {
		return ID_Vache;
	}
	public void setID_Vache(int iD_Vache) {
		ID_Vache = iD_Vache;
	}
	public Float getDistance() {
		return Distance;
	}
	public void setDistance(Float distance) {
		Distance = distance;
	}
	public Date getP�riode() {
		return P�riode;
	}
	public void setP�riode(Date p�riode) {
		P�riode = p�riode;
	}
	public Podom�tre(int iD_Pod, int iD_Vache, Float distance, Date p�riode) {
		super();
		ID_Pod = iD_Pod;
		ID_Vache = iD_Vache;
		Distance = distance;
		P�riode = p�riode;
	}
	
}
