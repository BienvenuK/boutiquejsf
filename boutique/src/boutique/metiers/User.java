package boutique.metiers;


import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;

@ManagedBean(name="user")
@SessionScoped
public class User {
	
	  private long id;
	    
		private String  nom;
	    private String prenom;
	    private String email;
	    private String motPasse;
	    private HtmlOutputLabel information ;
	    private int age ;
	    private String sexe;
//	    private Collection<User> users = new ArrayList<>();
			
	
	    
	    
//		public Collection<User> getUsers() {
//			return users;
//		}
//		public void setUsers(Collection<User> users) {
//			this.users = users;
//		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		public HtmlOutputLabel getInformation() {
			return information;
		}
		public void setInformation(HtmlOutputLabel information) {
			this.information = information;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMotPasse() {
			return motPasse;
		}
		public void setMotPasse(String motPasse) {
			this.motPasse = motPasse;
		}

}
