package abstarctanimalex;

abstract class Animal {
	
	String sound;
	String food;
	int hours;
	String location;
	
	abstract void makeNoise();
	abstract void eat();
	void sleep() {
		System.out.println("goes to sleep");
	}
	abstract void roam();
	
	

	public static void main(String[] args) {
	
		
		

	}

}
