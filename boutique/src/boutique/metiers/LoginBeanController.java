package boutique.metiers;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="loginBeanController")
@SessionScoped
public class LoginBeanController {
	
	private User user;
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	
	public LoginBeanController() {
		user = new User();
	}
	
	
	
	@SuppressWarnings("unused")
	public String login() {
		ListeUsers users = new ListeUsers();
		
		users.toString();
		System.out.println(users.toString()+"lkjhjkl");
			
			if(users == null) {
				
				 this.getUser().getInformation().setValue("il faut des renseigner des champ");
				 this.getUser().getInformation().setStyle("Color : red ");
				 return "login";
			}
			
			System.out.println("email" + this.user.getEmail()+ " " + "mot de passe " + this.user.getMotPasse() );
			User user1 = users.checkUser(this.user.getEmail(),  this.user.getMotPasse());
			
			//System.out.println(user1.toString());
			if(user1!= null) {
			
				
				this.user.getInformation().setValue("beau comme un dieu");
				this.user.getInformation().setStyle("Color : green ");
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("userValidate", user1);
				 return "vivuCatalogue";
			
				
			}else {
				
				this.user.getInformation().setValue("t'es pas cool");
				this.user.getInformation().setStyle("Color : red ");
				 return null;
			}
		
		
		
	}

}
