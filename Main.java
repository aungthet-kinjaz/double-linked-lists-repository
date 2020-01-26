public class Main {
	
	public static void main(String[] args) {
		
		UserDoubleLinkedList list = new UserDoubleLinkedList();
		
		User user1 = new User("Aung", 12);
		User user2 = new User("Kyaw", 18);
		User user3 = new User("Ko", 15);
		User user4 = new User("Soe", 18);
		User user5 = new User("Moe", 15);
		
		
		list.addToFront(user1);
		list.addToFront(user2);
		list.addToFront(user3);
		System.out.println("/// USER INFORMATION  ///");
		list.print();
		
		list.addToEnd(user4);
		list.addToEnd(user5);
		System.out.println("/// INSERT FROM END ///");
		list.print();
		
		list.removeFromFront();
		System.out.println("/// REMOVE HEAD /// ");
		list.print();
		
		list.removeFromEnd();
		System.out.println("/// REMOVE TAIL /// ");
		list.print();
		
		User user6 = new User("Thaw", 22);
		list.addBefore(user6, new UserNode(user4));
		System.out.println("/// INSERT BEFORE EXISTING NODE /// ");
		list.print();
		
		User user7 = new User("Paing", 33);
		list.addAfter(user7, new UserNode(user4));
		System.out.println("/// INSERT AFTER EXISTING NODE /// ");
		list.print();
	}
}
