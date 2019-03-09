package stu.mavendemo.factory.simplefactory;

import stu.mavendemo.factory.Animal;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = SimpleFactory.creatAnimal("Cat");
		animal.eat();
		
		Animal animal2 = SimpleFactory.creatAnimal("Dog");
		animal2.eat();
	}

}
