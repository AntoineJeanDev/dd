
public class Castle {
	
	private Room left_room;
	private Room right_room;
	private Room current_room;
	
	public Castle(Room left_room, Room right_room, Room current_room) {
		super();
		this.left_room = left_room;
		this.right_room = right_room;
		this.current_room = current_room;
	}

	public Room getLeft_room() {
		return left_room;
	}

	public void setLeft_room(Room left_room) {
		this.left_room = left_room;
	}

	public Room getRight_room() {
		return right_room;
	}

	public void setRight_room(Room right_room) {
		this.right_room = right_room;
	}

	public Room getCurrent_room() {
		return current_room;
	}

	public void setCurrent_room(Room current_room) {
		this.current_room = current_room;
	}
	
	

	
	
}
