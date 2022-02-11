package day8interface;

interface Beverages{
	int cost=5;
	void propareTea();
	///added both void below
	default void mix(){
		System.out.println("Mix the beverage properly");
	}
	static void rating(){
		System.out.println("ratings for beverages");
	}
}
interface Games 
{
		void paly();
		void pause();
		
}
///added another interface extended off interface
interface ModernGames extends Games{
	void grapshics();
	void animation();
}

abstract class Animal{

	int age;
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Animal should sleep");
	}
}
	
class Men extends Animal implements Beverages, Games
{

	@Override
	public void paly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void propareTea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}
public  class Interface {

		public void main(String[]args) {
			Men m = new Men();
			m.eat();
			m.sleep();
			m.paly();
			m.pause();
			
		}

	}














