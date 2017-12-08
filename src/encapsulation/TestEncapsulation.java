package encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Building building1 = new Building();
		building1.setStories(5);
		building1.setCapacity(350);
		building1.setMaterial("brick");
		building1.setType("residential");
		
		System.out.println("Building1 Details: " +
		"\n" + building1.getMaterial() + "\n" + building1.getType() + 
		"\n" + building1.getStories() + "\n" + building1.getCapacity());
		
		Building building2 = new Building();
		building2.setStories(2);
		building2.setCapacity(100);
		building2.setMaterial("wood");
		building2.setType("commercial");
		
		System.out.println("Building2 Details: " +
		"\n" + building2.getMaterial() + "\n" + building2.getType() + 
		"\n" + building2.getStories() + "\n" + building2.getCapacity());
	}

}
