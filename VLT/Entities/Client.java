package Entities;

public class Client extends Utilisateur {
private String Sp�cialit�;
	

	public Client(String sp�cialit�) {
		super();
		Sp�cialit� = sp�cialit�;
	}
	
	public String getSp�cialit�() {
		return Sp�cialit�;
	}
	public void setSp�cialit�(String sp�cialit�) {
		Sp�cialit� = sp�cialit�;
	}
	

}
