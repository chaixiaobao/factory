package stu.mavendemo.factory.simplefactory;

import stu.mavendemo.factory.Animal;
import stu.mavendemo.factory.Cat;
import stu.mavendemo.factory.Dog;

public class SimpleFactory {

	public static Animal creatAnimal(String type) {
		if (type.equals("Dog")) {
			return new Dog();
		} else if (type.equals("Cat")) {
			return new Cat();
		}
		return null;
	}

}
