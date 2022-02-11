package abstarctanimalex;

abstract class Canine extends Animal {

	@Override
	void makeNoise() {}
		

	@Override
	void eat() {}
	
	@Override
	void roam() {
		System.out.println("Canine roam because they get board");

	}

}
