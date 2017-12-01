
public class Car {
	String color;
	String model;
	String noise;
	public Car(String color, String model, String noise) {
		this.color = color;
		this.model = model;
		this.noise = noise;
	}
	public void drive() {
		char alpha = 'a';
		String suffix = "";
		boolean continuous = false;
		for(; alpha <= 'z'; alpha++) {
			suffix = Character.toString(alpha);
			suffix += alpha;
			if(noise.toLowerCase().indexOf(suffix) >= 0) {
				continuous = true;
				break;
			}
		}
		String prefix = "";
		String trail = "";
		if(continuous) {
			prefix = noise.substring(0, noise.toLowerCase().indexOf(suffix));
			trail = suffix;
		} else {
			trail = noise;
		}
		System.out.print(prefix);
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			System.out.print(trail);
		}
	}
}