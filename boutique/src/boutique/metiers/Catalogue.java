package boutique.metiers;

import java.util.ArrayList;

import javax.faces.model.ListDataModel;

public class Catalogue extends ListDataModel<Item>{
	
	public Catalogue() {
		ArrayList<Item> itemList = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			Item item = new Item();
			item.setName("name" + i);
			item.setPrice(i * 9.0);
			item.setDescription("I am Item N°" + i);
			itemList.add(item);
		}
		// Put itemList in the Catalogue (DataModel)
		this.setWrappedData(itemList);
	}

}
