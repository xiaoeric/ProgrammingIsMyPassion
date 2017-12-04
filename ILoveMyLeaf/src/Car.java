
public class Car {
	String color;
	String model;
	int speed;
	String noise;
	public Car(String color, String model, String noise, int speed) {
		this.color = color;
		this.model = model;
		this.noise = noise;
		this.speed = speed;
	}
	public void repaint(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void accelerate(int change) {
		this.speed += change;
		System.out.print("vroom");
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
			trail = noise.substring(noise.toLowerCase().indexOf(suffix), noise.toLowerCase().indexOf(suffix) + 2);
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