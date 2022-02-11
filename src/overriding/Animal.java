package overriding;





class Mamal {
	
	String color;
	int size;
	
	public void makeSound(){
	System.out.println("Animals make sounds");
}
	public void eat() {
		System.out.println("Animals eat food");
	}
}

class Cat extends Mamal{
	public void eat () {
		System.out.println("Cats eat fish");
}
	public void makeSound() {
		System.out.println("Cats meow!");
	}
}

class Dog extends Mamal {
	
	public void makeSound() {
		System.out.println("Dogs bark");
	}
	public void eat () {
		System.out.print("Dogs eat dog food");
	}
}
public class Animal {
	public static void main(String []args) {
		Cat c = new Cat ();
		c.makeSound();
		c.eat();
		
		Dog d = new Dog ();
		d.makeSound();
		d.eat();

		}
}