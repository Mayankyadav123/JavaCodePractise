package com.coding.designpattern.creational.abstractfactorypattern;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
