package unit2;

import java.util.Scanner;

public class PokemonGame {
	 public static void main(String[] args) {
	        
     // Your pokemon
	        String name = "Furret";
	        String type = "Normal";
	        int speed = 60;
	        int currentHP = 50;
	        int maxHP = 50;
	        
	        // Show the pokemon's stats
	        System.out.println("Pokemon Name: " + name);
	        System.out.println("Type: " + type);
	        System.out.println("Speed: " + speed);
	        System.out.println("Current HP/Max HP: " + currentHP + "/" + maxHP);
	        
	        // Ask the user if they wish to heal or battle
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("What would you like to do? (1) Heal or (2) Battle");
	        int choice = scanner.nextInt();
	        
	        // Process the user's choice
	        if (choice == 1) {
	            // Heal the pokemon
	            currentHP = maxHP;
	            System.out.println("Your Furret has been healed! It's now at full health.");
	            System.out.println("Farewell!");
	       
                        } else if (choice == 2) {
	            // Battle a random enemy pokemon
	            String[] enemyPokemon = {"Charzard", "Snorlax"};
	            int enemyIndex = (int) (Math.random() * enemyPokemon.length);
	            String enemyName = enemyPokemon[enemyIndex];
	            System.out.println("You are fighting " + enemyName + "!");
	            
	            // Choose the order of moves
	            boolean playerGoesFirst = (speed > Math.random() * 100);
	            int playerHP = currentHP;
	            int enemyHP = (int) (Math.random() * 40 + 60);
	            
	            while (playerHP > 0 && enemyHP > 0) {
	                if (playerGoesFirst) {
	                    // Your turn to attack
	                    System.out.println(name + " attacks " + enemyName + "!");
	                    boolean hit = Math.random() < 0.7;
	                    if (hit) {
	                        int damage = (int) (Math.random() * 20 + 10);
	                        enemyHP -= damage;
	                        System.out.println(name + " did " + damage + " damage to " + enemyName + "!");
	                    } else {
	                        System.out.println(name + "'s attack missed!");
	                    }
	                } else {
	                    // Enemy's turn to attack
	                    System.out.println(enemyName + " attacks " + name + "!");
	                    boolean hit = Math.random() < 0.7;
	                    if (hit) {
	                        int damage = (int) (Math.random() * 20 + 10);
	                        playerHP -= damage;
	                        System.out.println(enemyName + " did " + damage + " damage to " + name + "!");
	                    } else {
	                        System.out.println(enemyName + "'s attack missed!");
	                    }
	                }
	                
	                // Switch turn
	                playerGoesFirst = !playerGoesFirst;
	            }
	            
	            if (playerHP <= 0) {
	            	System.out.println(name + "has fainted!");

	                
}
}
	 }
}
