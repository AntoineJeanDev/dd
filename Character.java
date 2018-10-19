import java.util.Random;

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
		
		castle.setLeft_room(new Room());
		castle.setRight_room(new Room());
		
		nb_of_rooms++;
		
	}
	
	// show infos Nb_ROOM + Description ROOM
	public void show_infos (Castle castle) {
		
		System.out.println("Salle n° " + this.nb_of_rooms + ".");
		System.out.println(castle.getCurrent_room().getDescription());
	}
	
	// Action processed
	public void take_action (Castle castle, String action) {
		
		Random rand = new Random();
		
		// Aller à gauche
		if (action.equals("l") && castle.getCurrent_room().getType() == 1) {
			this.continuer(castle, castle.getLeft_room());
		}
				
		// Aller à droite
		if (action.equals("r") && castle.getCurrent_room().getType() == 1) {
			this.continuer(castle, castle.getRight_room());
		}
		
		// Se battre
		if (action.equals("b") && castle.getCurrent_room().getType() == 2) {
			if ((rand.nextInt(2) + 1) == 1) {
				System.out.println("Vous avez battu le monstre et gagné " + castle.getCurrent_room().getLoot() + " pièces d'or.");
				this.money += castle.getCurrent_room().getLoot();
				this.continuer(castle, new Room());
			}
			else {
				System.out.println("Vous avez perdu et perdez 1 HP");
				this.hp_count--;
				this.continuer(castle, new Room());
			}	
		}
		
		// Fuir
		if (action.equals("f") && castle.getCurrent_room().getType() == 2) {
			System.out.println("Vous fuyez...");
			this.continuer(castle, new Room());
		}
		
		// Aller à gauche salle trésor
		if (action.equals("l") && castle.getCurrent_room().getType() == 3) {
			this.continuer(castle, castle.getLeft_room());
		}
		
		// Aller à droite salle trésor
		if (action.equals("r") && castle.getCurrent_room().getType() == 3) {
			this.continuer(castle, castle.getRight_room());
		}

		// Looter le coffre
		if (action.equals("v") && castle.getCurrent_room().getType() == 3) {
			if ((rand.nextInt(2) + 1) == 1) {
				System.out.println("Vous lootez " + castle.getCurrent_room().getLoot() + " pièces d'or.");
				this.money += castle.getCurrent_room().getLoot();
				this.continuer(castle, new Room());
			}
			else {
				System.out.println("Le coffre était piégé, vous perdez 1 HP");
				this.hp_count--;
				this.continuer(castle, new Room());
			}
			
		}
		
	}
	
	

	
}
