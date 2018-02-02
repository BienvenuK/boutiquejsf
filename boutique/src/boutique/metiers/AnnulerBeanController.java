package boutique.metiers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AnnulerBeanController {
	
	User user;
	
	public AnnulerBeanController() {
		user = new User();
	}
	
	
	public String annuler() {
		return "login";
	}
	

}
