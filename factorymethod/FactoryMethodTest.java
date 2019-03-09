package stu.mavendemo.factory.factorymethod;

import stu.mavendemo.factory.Animal;

public class FactoryMethodTest {

	public static void main(String[] args) {

		AnimalFactory factory1 = new DogFactory();
		Animal animal1 = factory1.createAnimal();
		animal1.eat();

		AnimalFactory factory2 = new CatFactory();
		Animal animal2 = factory2.createAnimal();
		animal2.eat();

	}

}
