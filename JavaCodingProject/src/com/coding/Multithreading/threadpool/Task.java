package com.coding.Multithreading.threadpool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable{

	private String name;
	
	public Task(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<10;i++) {
				
			if(i==0) {
				Date d=new Date();
				SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
				System.out.println("Task name "+name+"Inistialized at"+ft.format(d));
			}else {
				Date d=new Date();
				SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
				System.out.println("Task name "+name+"Exicution at"+ft.format(d));
			}
			Thread.sleep(1000);			
			}
			System.out.println(name+"completed");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
