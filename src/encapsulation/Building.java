package encapsulation;

public class Building {
	
	private int stories;
	private String type;
	private String material;
	private String neighborhood;
	private int capacity;
	
	public int getStories() {
		return stories;
	}
	public void setStories(int stories) {
		this.stories = stories;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	public void setCapacity(int capacity) {
		if(capacity < 500) {
			this.capacity = capacity;
		}
	}
	public int getCapacity() {
		return capacity;
	}

}
