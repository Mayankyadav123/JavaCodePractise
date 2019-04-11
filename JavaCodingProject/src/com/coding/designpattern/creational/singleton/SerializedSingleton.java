package com.coding.designpattern.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7571802639155518712L;

	private int i=10;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	private SerializedSingleton() {}
	
	private static class SingletonHelper{
		
		private static final SerializedSingleton instance=new SerializedSingleton();
		
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
	
}
