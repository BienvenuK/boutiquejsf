package boutique.metiers;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="inscriptionBeanController")
@SessionScoped
public class InscriptionBeanController {
	
	
	private User user;
	private Collection<User>users;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public InscriptionBeanController() {
		 user = new User();
		users = new ArrayList<User>();
	}
	
	public String inscription(User user) {
		
		this.users.add(user);
		System.out.println("cest moi");
		
		return "login";
		
	}

//klug
	public Collection<User> getUsers() {
		return users;
	}


	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	
	
	

}
