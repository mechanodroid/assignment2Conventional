
public class Player extends Entity implements Printable {
	private ItemList inventory = new ItemList();
	private int health;
	public int getHealth() {
		return health;
	}
	public void setHealth(int h) {
		health = h;
	}
	public int getInventorySize(){
		return inventory.getItemListSize();
	}
	public ItemList getInventory(){
		return inventory;
	}
	public void addToInventory(Item i) {
		inventory.addItem(i);
	}
	public boolean findItem(Item i) {
		return inventory.find(i);
	}
	public void deleteFromInventory(Item i) {
		inventory.removeItem(i);
	}
	public String getDescription(){
		return super.getName() + "\n" + getInventory().getDescription() + "\n";
	}
}
