package unit2;

import java.util.Random;
    import java.util.Scanner;

 public class RussianRoulette {
  public static void main(String[] args) 
    
        Random rand = new Random();
        int chamber = rand.nextInt(6);
        int userChamber = 0;
        boolean playing = true;

        while (playing) {
            // for user to pull the trigger
            System.out.println("Pull the trigger? (y/n)");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

            if (userInput.equals("y")) {
                userChamber++;

                if (userChamber == chamber) {
                    // you lost 
                    System.out.println("BANG! You're dead LOL!.");
                    playing = false;
                } else {
                    System.out.println("Click.");
                }
            } else {
                playing = false;
            }
        }
    }
}

  }
}