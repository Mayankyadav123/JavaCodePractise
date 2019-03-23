package com.coding.interview.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Hi");
		map.put(2,"world");
		map.put(3,"hello");
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry str=(Entry) itr.next();
			System.out.println(str.getKey()+":"+str.getValue());
		}
		for(Map.Entry me: map.entrySet()) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

}
