package boutique.metiers;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ville")
@SessionScoped
public class Ville {
	
	private String name;
	private String cp;
	//gfh

	
	public Ville() {
		this.setCp("4000");
		
	}
	public String afficher() {
		
		if (getCp().equalsIgnoreCase("44000")) {
			setName("Nantes");
		
			
		}else {
			
		 setName("code postal inconu");
		}
		return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	

}
