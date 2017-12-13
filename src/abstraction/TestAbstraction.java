package abstraction;

public class TestAbstraction {

	public static void main(String[] args) {

		Device device1 = new Computer();
		
		Device printer1 = new Printer();
		
		Device device2 = new Phone();
		
		System.out.println("Computer: ");
		device1.turnOn();
		device1.run();
		device1.turnOff();
		
		System.out.println("Printer: ");
		printer1.turnOn();
		printer1.run();
		printer1.turnOff();
		
		System.out.println("Phone: ");
		device2.turnOn();
		device2.run();
		device2.turnOff();
		
	}

}
