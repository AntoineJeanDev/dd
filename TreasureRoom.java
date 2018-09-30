
public class TreasureRoom extends Room {
	
	private Integer treasure_loot;

	public TreasureRoom(Integer type) {
		super(type);
		
		this.setDescription("Tu te trouves actuellement dans une salle à trésor, tu peux l'ouvrir(o) ou continuer ton chemin (g/r)");
		
		Double n = (Math.random() * ( 100 - 10 ));
		this.treasure_loot = n.intValue();
	}
	
	public Integer getTreasure_loot() {
		return treasure_loot;
	}

}
