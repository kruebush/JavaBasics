package abstarctanimalex;

abstract class Hippe extends Animal {

	@Override
	void makeNoise() {
		System.out.println("Hippo grunts");

	}

	@Override
	void eat() {
		System.out.println("Hippos eat grass!");
	}

}
