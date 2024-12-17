import java.util.Scanner;

public class GuessAnimal {
    public static void main(String[] args) {
        System.out.println("\n\nLet's play 20 questions. Choose a game genre and I will try to guess it!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Does it involve role playing? (y/n)?");
        String answer = scan.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Does it involve playing online with many others (y/n)?");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("I guess MMORPG! Click on run to play again.");
            } else {
                System.out.println("Are the games from your genre from Japan? (y/n)?");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("I guess JRPG! Click on run to play again.");
                } else {
                    System.out.println("Does it revolve around Action? (y/n)");
                    answer = scan.nextLine();
                    if (answer.equalsIgnoreCase("y")) {
                        System.out.println("I guess ARPG! Click on run to play again.");
                    } else {
                        System.out.println("I guess Sandbox RPG! Click on run to play again.");
                    }
                }
            }
        } else {
            System.out.println("Is it an Action-Related genre? (y/n)");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Does it require combat? (y/n)");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("Does it revolve around guns? (y/n)");
                    answer = scan.nextLine();
                    if (answer.equalsIgnoreCase("y")) {
                        System.out.println("I guess Shooter Games! A personal favorite. Click on run to play again.");

                    
                
                } else {
                         System.out.println("Does it revolve around music (y/n)");
                         answer = scan.nextLine();
                    }                     
                    if (answer.equalsIgnoreCase("y"))
                    {
                        System.out.println("I guess Rhythm games! Click on run to play again.");
                    } else {
                        System.out.println("Does it revolve around survival? (y/n)");
                        answer = scan.nextLine();
                    } if (answer.equalsIgnoreCase("y")) {
                        System.out.println("I guess Survival games! Click on run to play again.");
                    } else {
                        System.out.println("Is it survival of the fittest? (y/n)");
                        answer= scan.nextLine();
                    } if (answer.equalsIgnoreCase("y")) {
                        System.out.println("I guess Battle Royale games! Click on run to play again.");
                    } else {
                        System.out.println("I Guess Action-Adventure games! Click on run to play again.");
                    }
                    
                    


                } else {
                    System.out.println("I guess Puzzle Games! Click on run to play again.");
                }
            } else {
                System.out.println("I guess Simulation Games! Click on run to play again.");
            }
        }

        scan.close();
    }
}