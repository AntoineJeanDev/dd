
public class MonsterRoom extends Room {

	private Integer monster_loot;
	
	public MonsterRoom(Integer type) {
		super(type);
		
		this.setDescription("Tu te trouves actuellement dans une salle à monstre, tu peux te battre(b) ou fuir (g/r)");
		
		Double n = (Math.random() * ( 100 - 10 ));
		this.monster_loot = n.intValue();
	}
	
	public Integer getMonster_loot() {
		return monster_loot;
	}

}
