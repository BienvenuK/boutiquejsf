package boutique.metiers;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@ApplicationScoped
public class Item {
	
	private String name;
	private Double price;
	private String description;
	private String nameErreur, priceErreu,descriptionErreur;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double prix) {
		this.price = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String enregistrer() {
		//huiglb
		return null;
	}
	
	public void nameVerif(AjaxBehaviorEvent event) {
		System.out.println("verif "+getName());
		if(this.getName().length() >= 4 ) {
			this.setNameErreur("il y a trop de caractere");
		}else {
			this.setNameErreur("");
		}
			
	}
	
	
	public void verifPrice(AjaxBehaviorEvent event) {
		
		
	
			HtmlInputText composantSaisie = (HtmlInputText)event.getSource();
			Double prix;
			
			try {
				 prix = new  Double(this.getPrice());
				 if(prix<0) {
					 composantSaisie.setStyle("background-color : red");
				 }else {
					 System.out.println("positif");
				 }
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
			
	}
	
	public String getNameErreur() {
		return nameErreur;
	}
	public void setNameErreur(String nameErreur) {
		this.nameErreur = nameErreur;
	}
	public String getPriceErreu() {
		return priceErreu;
	}
	public void setPriceErreu(String priceErreu) {
		this.priceErreu = priceErreu;
	}
	public String getDescriptionErreur() {
		return descriptionErreur;
	}
	public void setDescriptionErreur(String descriptionErreur) {
		this.descriptionErreur = descriptionErreur;
	}

}
