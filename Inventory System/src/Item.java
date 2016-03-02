import java.util.ArrayList;

public class Item {
	ArrayList<Item> items;
	
	public void InventoryList(){
		
	}
	
	public Item getItem(int i){
		return this.items.get(i);
	}
	
	public void addItem(Item addItem){
		this.items.add(addItem);
	}
	
	public void removeItem(Item removeItem){
		this.items.remove(removeItem);
	}
}
