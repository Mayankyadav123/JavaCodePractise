package com.coding.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Jungle {

	private static HashMap<String, List<Animal>> animalMap = new HashMap<String, List<Animal>>();

	public static void addAnimal(List<Animal> animals) {
		for (Animal animal : animals) {
			List<Animal> aList = new ArrayList<>();
			if (animalMap.containsKey(animal.getClass().getSimpleName())) {
				aList = animalMap.get(animal.getClass().getSimpleName());
				aList.add(animal);
				animalMap.put(animal.getClass().getSimpleName(), aList);
			} else {
				aList.add(animal);
				animalMap.put(animal.getClass().getSimpleName(), aList);
			}
		}
	}

	public static void soundOff() {
		System.out.println("***************Sound Off*******************");
		animalMap.forEach((k, v) -> {
			System.out.println("============" + k + ":same type animal size:"+v.size()+"============");
			v.forEach(obj -> {
				obj.currentEnergyLevel();
				obj.makeSound();
				obj.currentEnergyLevel();
			});
		});
		System.out.println("*************************************");

	}

	public static List<Animal> createDummyList() {
		List<Animal> animals = new ArrayList<>();
		Snake s1 = new Snake();
		Snake s2 = new Snake();
		Monkey m1 = new Monkey();
		Monkey m2 = new Monkey();
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		animals.add(s1);
		animals.add(s2);
		animals.add(m1);
		animals.add(m2);
		animals.add(t1);
		animals.add(t2);
		addAnimal(animals);
		return animals;
	}

	public static void runAllOperations() {
		animalMap.forEach((k, v) -> {
			System.out.println("============" + k + "============");
			v.forEach(animal -> {
				animal.currentEnergyLevel();
				animal.makeSound();
				animal.sleep();
				if (animal instanceof Monkey) {
					((Monkey) animal).play("Oooo Oooo Oooo");
					((Monkey) animal).play("ho ho ho");
				}
				if (animal instanceof Tiger) {
					((Tiger) animal).eatFood(Food.grain.toString());
					((Tiger) animal).eatFood(Food.meat.toString());
				}else {
					animal.eatFood();
				}
				animal.currentEnergyLevel();
				getAnimalCount(animal);
			});
			System.out.println("========================");
		});
	}

	public static int getAnimalCount(Animal animal) {
		int size = animalMap.get(animal.getClass().getSimpleName()).size();
		System.out.println("Animal of type: " + animal.getClass().getSimpleName() + " are :" + size);
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createDummyList();
		runAllOperations();
		soundOff();
	}

}
