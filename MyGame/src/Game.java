import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("***Welcome To Rock , Paper , Scissors***");

		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		int randomNum = rand.nextInt(3);
		String computer_move = "";
		
		if(randomNum == 0) {
			computer_move = "rock";
		} else if(randomNum == 1) {
			computer_move = "paper";
		} else if(randomNum == 2) {
			computer_move = "scissors";
		}
		
		int Player1_point = 0;
		int Computer_point = 0;
		int winning_point = 4;
		
		while(Player1_point < winning_point && Computer_point < winning_point) {
			System.out.println("---------------------------------------");
			System.out.println("Player 1 point : " + Player1_point);
			System.out.println("Computer point : " + Computer_point);
			System.out.println("---------------------------------------");
			System.out.println("Player 1 ,make your move : ");
			String Player1 = s.next(); 
			
			if(Player1.equals(computer_move)) {
				
				System.out.println("***Thats a tie***");
				
			} else if(Player1.equals("rock")) {
				
				if(computer_move.equals("paper")) {
					
					System.out.println("Computer Wins!...");
					Computer_point += 1;
					
				} else if(computer_move.equals("scissors")) {
					
					System.out.println("**Player 1 wins**");
					Player1_point += 1;
					
				}
				
			} else if(Player1.equals("paper")) {
				
				if(computer_move.equals("rock")) {
					
					System.out.println("**Player 1 wins**");
					Player1_point += 1;
					
				} else if(computer_move.equals("scissors")) {
					
					System.out.println("Computer Wins!...");
					Computer_point += 1;
					
				}
				
			} else if(Player1.equals("scissors")) {
				
				if(computer_move.equals("paper")) {
					
					System.out.println("Computer Wins!...");
					Computer_point += 1;
					
				} else if(computer_move.equals("rock")) {
					
					System.out.println("**Player 1 wins**");
					Player1_point += 1;
					
				}
				
			} else if(Player1.equals("q") || Player1.equals("quit")) {
				
				System.out.println("***Goodbye***");
				break;
				
			} else {
				
				System.out.println("Something went wrong!!!");
				
			}
			
			System.out.println("Final Score : ");
			System.out.println("Player 1 : " + Player1_point);
			System.out.println("Computer : " + Computer_point);
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
