package com.coding.datastructure.LinkedList;

import org.w3c.dom.Node;

public class LinkedList {
	Node head;

	static class Node {
		Node next;
		int data;
		Node(int data){
			this.data=data;
		}
		@Override
		public String toString() {
			return "Node [next=" + next + ", data=" + data + "]";
		}
	}
	
	public static LinkedList insertion(LinkedList list,int data) {
		Node new_node= new Node(data);
		new_node.next=null;
		if(list.head==null) {
			list.head=new_node;
		}else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
	public static LinkedList deletion(LinkedList list,int key) {
		Node currentNode=list.head;
		Node prev=null;
		
		if(currentNode !=null && currentNode.data==key) {
			list.head=currentNode.next;
			return list;
		}
		
		while(currentNode!=null && currentNode.data!=key) {
			prev=currentNode;
			currentNode=currentNode.next;
		}
		
		if(currentNode!=null) {
			prev.next=currentNode.next;
			System.out.println(key +"found and deleted");
		}
		if(currentNode==null) {
			System.out.println("Not found:"+key);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list=insertion(list,1);
		System.out.println(list.toString());
	}

}
