import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			
		// game starts
		String name;
		String action;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bonjour aventurier, comment te nomme-tu?");
		name = sc.nextLine();
		
		// player construction
		Character player = new Character(name, 5, 0);
		
		// castle construction
		Castle castle = new Castle(new Room(),new Room(),new Room());
		
		
		// welcome message
		System.out.println("Bienvenue " + player.getName() + " tu possèdes " + player.getHp_count() + " HP ainsi que " + player.getMoney() + " pièces d'or.");
		
		
		// game loop
		do {
			
			// show infos Nb_ROOM + Description ROOM
			player.show_infos(castle);
			
			// Récupère l'action désirée
			action = sc.nextLine();
			
			// Launch action
			player.take_action(castle, action);
				
			
		} while (player.getHp_count() > 0);
		
		
		// Show score
		System.out.println("Vous avez perdu, votre score est de " + player.getMoney() + " pièces d'or");
		
		sc.close();
		
	}

}
