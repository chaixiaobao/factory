package stu.mavendemo.factory.factorymethod;

import stu.mavendemo.factory.Animal;
import stu.mavendemo.factory.Cat;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}