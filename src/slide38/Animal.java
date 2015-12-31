package slide38;

public interface Animal {
	
	public void eat();
	public void travel();

}

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating!");
	}

	@Override
	public void travel() {
		System.out.println("Dog is traveling!");
	}
	
}

class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat is eating!");
	}

	@Override
	public void travel() {
		System.out.println("Cat is traveling");
	}
	
}

class Main {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat();
	}
}