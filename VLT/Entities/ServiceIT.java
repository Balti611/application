package Entities;

public class ServiceIT  extends Utilisateur {
	private  int ID_IT ;
	private String Sp�cialit�;
	
	public String getSp�cialit�() {
		return Sp�cialit�;
	}
	public void setSp�cialit�(String sp�cialit�) {
		Sp�cialit� = sp�cialit�;
	}
	public int getID_IT() {
		return ID_IT;
	}
	
	public ServiceIT(int iD_IT, String sp�cialit�) {
		super();
		ID_IT = iD_IT;
		Sp�cialit� = sp�cialit�;
	}
	
}
