import java.util.Random;

public class Room {
	
	private Integer type; // 1 = nothing .. 2 = monster .. 3 == treasure
	private String description;
	private Integer loot;

	
	public Room() {
		super();
		
		Random rand = new Random();
		this.type = rand.nextInt(3) + 1;
		
		if (type == 1) {
			this.description = "Tu te trouves actuellement dans une salle vide, tu peux aller à gauche (l) ou a droite (r)";
			
		}	
		else if (type == 2) {
			this.description ="Tu te trouves actuellement dans une salle à monstre, tu peux te battre ou fuir (b/f)";
			this.loot = rand.nextInt(100);
		}
		else if (type == 3) {
			this.description ="Tu te trouves actuellement dans une salle au trésor, tu peux aller à gauche (l) ou a droite (r) ou loot le coffre (v)";
			this.loot = rand.nextInt(100);
		}
			
		
	}

	public Integer getLoot() {
		return loot;
	}

	public void setLoot(Integer loot) {
		this.loot = loot;
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
