package stu.mavendemo.factory.abstractfactory;

import stu.mavendemo.factory.Animal;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory1 = new BENZAndCatFactory();
		Animal animal1 = factory1.createAnimal();
		animal1.eat();
		Car car1 = factory1.createCar();
		car1.Drive();

		AbstractFactory factory2 = new BMWAndDogFactory();
		Animal animal2 = factory2.createAnimal();
		animal2.eat();
		Car car2 = factory1.createCar();
		car2.Drive();
	}

}
