package Entities;

public class Administrateur extends Utilisateur {
	private String Sp�cialit�;
	
	public Administrateur () {
		
	}
	
	public Administrateur( String sp�cialit�) {
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



