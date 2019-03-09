package stu.mavendemo.factory.abstractfactory;

import stu.mavendemo.factory.Animal;
import stu.mavendemo.factory.Cat;

public class BENZAndCatFactory extends AbstractFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Cat();
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BENZ();
	}

	
}
