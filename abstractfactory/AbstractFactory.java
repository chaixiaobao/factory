package stu.mavendemo.factory.abstractfactory;

import stu.mavendemo.factory.Animal;

public abstract class AbstractFactory {
	
	public abstract Animal createAnimal();
	
	public abstract Car createCar();

}
