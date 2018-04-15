package rapproBancaire;

import javax.enterprise.inject.Model;

@Model
public class loginController {
	
   private String login;
   private int mdp;

public int getMdp() {
	return mdp;
}
public void setMdp(int mdp) {
	this.mdp = mdp;
}
public loginController(String login, int mdp) {
	super();
	this.login = login;
	this.mdp = mdp;
}
public loginController() {
	super();
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String check() {
	String lien="";
	if(login.equals("cms123") && mdp==1234) {
	lien ="/index";}
	else {
		lien ="login";
	}
	return lien;
}  
  

}
