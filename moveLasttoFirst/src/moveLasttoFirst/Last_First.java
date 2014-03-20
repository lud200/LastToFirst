package moveLasttoFirst;

import java.util.Scanner;

public class Last_First {
	public static void main(String args[]){
		int option;
		List l=new List();
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. Insert Begin"+"\n"+"2. swap");
			System.out.println("Enter 0 to exit");
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			switch(option){
			case 1: l.insertBegin();
			l.print();
			break;
			case 2: l.LastFirst();
			l.print();
			break;
			case 0:System.exit(0);
			}
		}
	}
}
class List{
	private class Node{
		int data;
		Node next;
	}
	Node head=null;
	public void print(){
		Node n=new Node();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public void LastFirst(){
		Node n=head;
		Node p=head.next;
		Node temp=new Node();
		while(p.next!=null){
			n=n.next;
			p=p.next;
		}
		n.next=null;
		temp.data=p.data;
		temp.next=head;
		head=temp;
		
	}
	public void insertBegin(){
		Node node=new Node();
		if(head==null){
			head=node;
			Scanner sc=new Scanner(System.in);
			head.data=sc.nextInt();
			head.next=null;
		}
		else{
			node.next=head;
			Scanner sc=new Scanner(System.in);
			node.data=sc.nextInt();
			head=node;
		}
	}
}