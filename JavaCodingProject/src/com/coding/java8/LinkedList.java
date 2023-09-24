package com.coding.java8;

public class LinkedList {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
		
		public static void printMe(Node n){
			while(n.next==null) {
				System.out.println("Data:"+n.data+" ");
			}
		}
		
		public static LinkedList push(LinkedList list,int data)
		{		
			Node newNode = new Node(data);
			newNode.next=null;

			// if new list then no head hence add as first element
			if(list.head ==null) {				
				list.head=newNode;
			} else {
				//if not then search for last node of list and add
				Node last = list.head;
				while(last.next!=null) {
					last=last.next;
				}
				last.next=newNode;
			}
			return list;
		}
		
		// search for key
		public boolean search(Node head,int key) {
			
			if(head==null) {
				return false;
			}
			if(head.data==key) {
				return true;
			}
		
			return search(head.next,key);
		}
		
		
		public static LinkedList delete(LinkedList list,int key) {
			// head is always first element of linkedlist
			Node currentNode=list.head;
			Node prev = null;
			// if current node is the one then add next pointer
			if(currentNode!=null && currentNode.data==key) {
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
		
	}
	
	public static void main(String args[]) {
		java.util.LinkedList<Integer> list=new java.util.LinkedList<Integer>();
		list.push(1029);
		list.push(22);
		list.push(31);
//		list.addFirst(1);
//		list.addLast(2);
		list.add(111); //using add method is better as it adds in expected order first element in first
		System.out.println(list.getFirst());
		list.stream().forEach(System.out::println);
	}

}
