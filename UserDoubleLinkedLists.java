package atk.employee.linkedlist2;

public class UserDoubleLinkedList {

	private UserNode head;
	private UserNode tail;
	private int size;

	public UserNode getHead() {
		return head;
	}

	public void setHead(UserNode head) {
		this.head = head;
	}

	public UserNode getTail() {
		return tail;
	}

	public void setTail(UserNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void addToFront(User user) {
		
		UserNode newNode = new UserNode(user);
		if(head == null) {
			tail = newNode;
		}else {
			newNode.setNext(head);
			head.setPrevious(newNode);
		}
		head = newNode;
		size++;
	}
	
	public void addToEnd(User user) {
		
		UserNode newNode = new UserNode(user);
		if(tail == null) {
			head = newNode;
		}else {
			newNode.setPrevious(tail);
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}
	
	public UserNode removeFromFront() {
		
		UserNode removeNode = head;
		if(head == null) {
			System.out.println("Linked Lists is empty");
		}
		if (head.getNext() == null) {
			tail = null;
		}else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		removeNode.setNext(null);
		size--;
		return removeNode;
	}
	
	public UserNode removeFromEnd() {
		
		UserNode removeNode = tail;
		if (tail == null) {
			System.out.println("Linked Lists is empty");
		}
		if (tail.getPrevious() == null) {
			head = null;
		}else {
			removeNode.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		removeNode.setPrevious(null);
		size--;
		return removeNode;
	}
	
	public boolean addBefore(User user, UserNode existingNode) {
		
		if (head == null) {
			System.out.println("Linked lists is empty");
		}
		UserNode currentNode = head;
		while(currentNode != null && currentNode.getUser() != existingNode.getUser()){
			currentNode = currentNode.getNext();
		}
		
		UserNode newNode = new UserNode(user);
		newNode.setPrevious(currentNode.getPrevious());
		newNode.setNext(currentNode);
		currentNode.setPrevious(newNode);
		
		if (newNode.getPrevious() == null) {
			head = newNode;
		}else {
			newNode.getPrevious().setNext(newNode);
		}
		size++;
		return true;
	}
	
	public boolean addAfter(User user, UserNode existingNode) {
		
		if (tail == null) {
			System.out.println("Linked lists is empty");
		}
		UserNode currentNode = tail;
		while( currentNode != null && currentNode.getUser() != existingNode.getUser()) {
			currentNode = currentNode.getPrevious();
		}
		
		UserNode newNode = new UserNode(user);
		newNode.setNext(currentNode.getNext());
		newNode.setPrevious(currentNode);
		currentNode.setNext(newNode);
		
		if (newNode.getNext() == null) {
			newNode.getPrevious().setNext(newNode);
		}
		size++;
		return true;
	}
	
	public void print() {
		UserNode current = head;
		System.out.println();
		while(current != null) {
			System.out.println(current);
			System.out.println();
			current = current.getNext();
		}
	}
}
