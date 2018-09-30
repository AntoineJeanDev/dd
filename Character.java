
public class Character {

	private String name;
	private Integer hp_count;
	private Integer money;
	private Integer nb_of_rooms;
	
	public Character(String name, Integer hp_count, Integer money) {
		super();
		this.name = name;
		this.hp_count = hp_count;
		this.money = money;
		this.nb_of_rooms = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHp_count() {
		return hp_count;
	}

	public void setHp_count(Integer hp_count) {
		this.hp_count = hp_count;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
	
	public Integer getNb_of_room() {
		return nb_of_rooms;
	}
	
	public void continuer(Castle castle, Room room) {
		
		castle.setCurrent_room(room);
		nb_of_rooms++;
		
	}
	
	

	
}
