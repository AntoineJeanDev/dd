import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			
		// game starts
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bonjour aventurier, comment te nomme-tu?");
		name = sc.nextLine();
		sc.close();
		
		// player construction
		Character player = new Character(name, 5, 100);
		
		// rooms constructions
		Room left_room = new Room(1);
		Room right_room = new Room(2);
		Room current_room = new Room(3);
		
		// castle construction
		Castle castle = new Castle(left_room,right_room,current_room);
		
		
		
		// welcome message
		System.out.println("Bienvenue " + player.getName() + " tu possèdes " + player.getHp_count() + " HP ainsi que " + player.getMoney() + " pièces d'or.");
		
		
		// game loop
		do {
			
			System.out.println("Salle n° " + player.getNb_of_room() + ".");
			
			if (castle.getCurrent_room().getType() == 1) {
				System.out.println("Tu te trouves actuellement dans une salle vide, tu peux aller à gauche (g) ou a droite (r)");
			}
			else if (castle.getCurrent_room().getType() == 2) {
				System.out.println("Tu te trouves actuellement dans une salle à monstre, tu peux te battre ou fuir (g/r)");
			}
			else if (castle.getCurrent_room().getType() == 3) {
				System.out.println("Tu te trouves actuellement dans une salle vide, tu peux aller à gauche (g) ou a droite (r)");
			}
			
			
		} while (player.getHp_count() > 0);
		
	}

}
