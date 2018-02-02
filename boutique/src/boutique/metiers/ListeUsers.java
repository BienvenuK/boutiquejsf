package boutique.metiers;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;


@ManagedBean
@ApplicationScoped
public class ListeUsers {

	private Collection< User> users;

	public  ListeUsers() {
		users = new ArrayList<>();
		User user1 = new User();
	
			user1.setNom("nom1");
			user1.setPrenom("prenom1");
			user1.setEmail("email1");
			user1.setMotPasse("password1");
			users.add(user1);
			
			User user2 = new User();
			user2.setNom("nom2");
			user2.setPrenom("prenom2");
			user2.setEmail("email2");
			user2.setMotPasse("password2");
			users.add(user2);
		
	
	}

	public User  checkUser( String email, String password) {

		for (User user : this.users) {
			System.out.println(user.getEmail() + user.getMotPasse());
			if(user.getEmail().equals(email) && user.getMotPasse().equals(password)) {
				return user;
			}
		}

		return null;
	}

}


