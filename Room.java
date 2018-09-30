
public class Room {
	
	private Integer type; // 1 = nothing .. 2 = monster .. 3 == treasure
	private String description;
	
	public Room(Integer type) {
		super();
		this.type = type;
		
		
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desciption) {
		this.description = desciption;
	}
	
	

}
