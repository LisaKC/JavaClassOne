package abstraction;

public abstract class Device {
	
	public void turnOn() {
		System.out.println("Turn on a device");
	}
	public void turnOff() {
		System.out.println("Turn off a device");
	}
	public abstract void run();

}
