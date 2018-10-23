import java.util.Random;
import java.util.Scanner;

public class Game {

	private Scanner sc = new Scanner(System.in);
	private int nbUser;
	private String repUser;
	private int compt = 0;
	private boolean replay = true;
	private int nbRandom = 0;
	private Random r = new Random();
	
	public Game() {
		super();
	
		do {
			
			compt = 0;
			nbRandom = r.nextInt(500-1) + 1;
			
			System.out.println("Bienvenue dans le jeu du Plus ou Moins !\n"
					+ "Un nombre aléatoire entre 1 et 500 a été généré !\n"
					+ "Essayez de le trouver !\n"
					+ "================================================");
			
			while(nbUser != nbRandom) {
				
				compt++;
			
				System.out.println("Saisissez un nombre: ");
				nbUser = sc.nextInt();
				
				if (nbUser < nbRandom) {
					System.out.println("Trop petit !");
				}else if(nbUser > nbRandom) {
					System.out.println("Trop grand !");
				}else {
					System.out.println("Bravo ! Vous avez gagné en " + compt + " coups !");
				}
				
			}
			
			System.out.println("Voulez-vous rejouez? (O/N)");
			Scanner scReplay = new Scanner(System.in);
			repUser = scReplay.nextLine();
			
			if (!(repUser.equals("o") || repUser.equals("O"))) {
				replay = false;
				
				System.out.println("Vous quittez le jeu...");
			}
			
		} while (replay == true);
		
	}
	
	

}
