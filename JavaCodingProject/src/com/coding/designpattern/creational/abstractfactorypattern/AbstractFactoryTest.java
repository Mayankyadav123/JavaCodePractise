package com.coding.designpattern.creational.abstractfactorypattern;


//Factory of factories
//In abstract factory we remove the if else condition 
//Each product gets individual factory
//
public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}

}
