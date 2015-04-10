package test;
public class Test {

	public static void main(String[] args) throws Exception {
		Stack s1 = new Stack();
		Queue q1 = new Queue();
		q1.Enqueue(10);
		q1.Enqueue(20);
		q1.Enqueue(30);
		q1.print();
		q1.Dequeue();
		q1.Dequeue();
		//q1.Dequeue();
		q1.print();
		s1.push(10);
		s1.push(20);
		s1.print();
		s1.pop();
		s1.print();
		
	}
}

class Queue{
	Node Head;
	Node Pointer;
	void Enqueue(int v){
		if(Pointer==null){
			Pointer = new Node(v);
		}
		else{
				Head = Pointer;
				while(Pointer.getNextNode()!=null){
					Pointer = Pointer.getNextNode();
				}
				Pointer.next = new Node(v);
				Pointer = Head;
		}
	}
	int Dequeue(){
		if(Pointer!=null){
			int temp = Pointer.getValue();
			Pointer = Pointer.getNextNode();
			return temp;
		}
		else
			return -1;
	}
	void print(){
		Node temp = Pointer;
		System.out.println("\nPrinting Queue\n");
		while(temp!= null){
			System.out.println(temp.getValue()+"\n");
			temp = temp.getNextNode();
		}
	}
}

class Stack{
	Node Head;
	void push(int v){
		if(Head == null){
			Head = new Node(v);
		}
		else{
			Head = new Node(v,Head);
		}
	}
	int pop(){
		if(Head!=null){
			int temp = Head.getValue();
			Head = Head.getNextNode();
			return temp;
		}
		else
			return -1;
	}
	void print(){
		Node temp = Head;
		System.out.println("\nPrinting Stack\n");
		while(temp!= null){
			System.out.println(temp.getValue()+"\n");
			temp = temp.getNextNode();
		}
	}
}

class Node{
	int v;
	Node next;
	Node(int value){
		v = value;
		next = null;
	}
	Node(int value, Node nextNode){
		v = value;
		next = nextNode;
	}
	int getValue(){
		return v;
	}
	Node getNextNode(){
		return next;
	}
	void print(){
		System.out.println("V = "+v);
		System.out.println("Next Node = "+next);
	}
}
