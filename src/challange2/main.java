package challange2;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // creating a random number
        Random rand = new Random();
        int winningNum = rand.nextInt(10);


        // Welcoming new user
        System.out.println("HELLO ADVENTURER");
        System.out.println("Please, tell me your name: ");

        // Getting his name and saying hello to him
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        // Asking about starting the game
        System.out.println("Should we start the game? [Y/N]: ");
        String choice = scanner.next();


        // The game
//        if (choice.equals("Y")){
//            System.out.println("Tell me your guess: ");
//            int hisGuess = scanner.nextInt();
//
//            if (hisGuess == winningNum){
//                System.out.println("Congratulations, you finished the game!");
//            } else{
//                System.out.println("Sorry, but it's not the right number.");
//                System.out.println("The right number is: " + winningNum);
//            }
//
//        }else{
//            System.out.println("You quited the game");
//        }


        //The game with while

        int wrongGuess = 0;

        while(choice.equals("Y")) {
            System.out.println("Tell me your guess of winning number (1-10): ");
            int hisGuess = scanner.nextInt();

            if (hisGuess == winningNum) {
                System.out.println("Congratulations, you finished the game!");
                break;
            } else if(wrongGuess == 5){
                System.out.println("You're terrible at this game.");
                System.out.println("The number was: " + winningNum);
                break;


            } else {
                System.out.println("Sorry, but it's not the right number. Try again");
                if (hisGuess > winningNum){
                    System.out.println("The number is lower");
                }else if (hisGuess < winningNum){
                    System.out.println("The number is higher");
                }
                wrongGuess++;
            }
        }




    }
}
