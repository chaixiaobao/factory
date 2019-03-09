package stu.mavendemo.factory.factorymethod;

import stu.mavendemo.factory.Animal;
import stu.mavendemo.factory.Dog;

public class DogFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
