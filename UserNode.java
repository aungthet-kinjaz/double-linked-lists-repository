public class UserNode {

	private User user;
	private UserNode next;
	private UserNode previous;

	public UserNode(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserNode getNext() {
		return next;
	}

	public void setNext(UserNode next) {
		this.next = next;
	}

	public UserNode getPrevious() {
		return previous;
	}

	public void setPrevious(UserNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return user.toString();
	}

}
