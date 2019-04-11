package com.coding.designpattern.creational.singleton;

//not good
// similar to EagerInitializationSingleton but provide exception handling
public class StaticBlockSingleton {

		private static StaticBlockSingleton instance;
		
		private StaticBlockSingleton() {}
		
		static {
			try {
			instance=new StaticBlockSingleton();
			}catch (Exception e) {
				throw new RuntimeException("Error occured in creating singlton instance");
			}
		}
		
		public static StaticBlockSingleton getInstance() {
			return instance;
		}
		
}
