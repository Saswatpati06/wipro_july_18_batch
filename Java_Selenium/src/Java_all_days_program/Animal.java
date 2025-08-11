package Java_all_days_program;

//super class
class An 
{
	public void eat()
	{
		System.out.println("Animals eat food");
	}
}

//subclass1
class Dog extends An
{
	public void bark()
	{
		System.out.println("Dog barks");
	}
}

//subclass2
class cat extends An
{
	public void meow()
	{
		System.out.println("Cat meows");
	}
}

//main class
class Animal
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		
		d.eat();
		d.bark();
		
       cat c = new cat();
		
		c.eat();
		c.meow();
		
	}
}