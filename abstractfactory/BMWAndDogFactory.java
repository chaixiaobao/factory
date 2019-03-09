package stu.mavendemo.factory.abstractfactory;

import stu.mavendemo.factory.Animal;
import stu.mavendemo.factory.Dog;

public class BMWAndDogFactory extends AbstractFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
