import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nYou are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east.\nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine(); // use nextLine() in your own IDE

        if (command.equalsIgnoreCase("n")) {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys. Continue (y/n)?");
            command = scan.nextLine();
            if (command.equalsIgnoreCase("y")) {
                System.out.println("You enter the forest and it's just some friendly monkeys. Continue (y/n)?");
                command = scan.nextLine();
                if (command.equalsIgnoreCase("y")) {
                    System.out.println("You see a mysterious structure in the distance. Will you continue (y/n)?");
                    command = scan.nextLine();
                    if (command.equalsIgnoreCase("y")) {
                        System.out.println("You enter and see a mysterious relic. It's actually an ancient relic worth trillions of dollars!");
                    } else {
                        System.out.println("You chicken out and return to the main island.");
                    }
                } else {
                    System.out.println("You chicken out and return to the main island.");
                }
            } else {
                System.out.println("You chicken out and return to the main island.");
            }
        } else if (command.equalsIgnoreCase("s")) {
            System.out.println("You get on your boat and go to sea. The waves seem a little bit unusual. Do you continue your sail (y/n)?");
            command = scan.nextLine();
            if (command.equalsIgnoreCase("y") && Math.random() > 0.5) {
                System.out.println("You continue to sail and see land! You see the riches overflow it. You are going to be a billionaire!!");
            } else {
                System.out.println("It was a tsunami! You get swept up and you die.");
            }
        } else if (command.equalsIgnoreCase("e")) {
            System.out.println("You go to the shack on the beach. You hear a little sound when you approach the door. Open it (y/n) or head back (n)?");
            command = scan.nextLine();
            if (command.equalsIgnoreCase("y")) {
                System.out.println("You head in and see a weird humanoid. It screams at you like it's angry but you feel like you can take it on. Press y to continue.");
                command = scan.nextLine();
                if (command.equalsIgnoreCase("y") && Math.random() > 0.5) {
                    System.out.println("You successfully defeat the weird humanoid and he actually becomes your friend. You guys find the OmegaStal, a crystal fused with an all-powerful material.");
                } else {
                    System.out.println("You lose to the weird humanoid and you die a painful death.");
                }
            } else {
                System.out.println("You chicken out and head back to the main island.");
            }
        } else if (command.equalsIgnoreCase("w")) {
            System.out.println("You go to the west. From your eyes, it looks like an infinite desert. This place is an anomaly within the island. Do you continue (y/n) or go back (n)?");
            command = scan.nextLine();
            if (command.equalsIgnoreCase("y")) {
                System.out.println("After walking for what feels like a century, you realize that you should have never come here. It is infinite and now you are stuck here to walk for another eternity.");
            } else {
                System.out.println("You chicken out and return to the main island.");
            }
        } else {
            System.out.println("Invalid input. Nothing happens");
        }

        System.out.println("End of adventure!");
        scan.close();
    }
}
