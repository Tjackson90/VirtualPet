import java.util.Scanner;

public class VirtualPetApp {


    public static void main(String[] args) {
        new Thread(new GameLoop()).start();

        Scanner input = new Scanner(System.in);
        VirtualPet newPet = new VirtualPet(50, 50, 50, 50);

        System.out.println("Hey, welcome to the VPA (Virtual Pet App)!");
        System.out.println("Please enter in your pet's name!");
        String petName = input.nextLine();
        String[] needs = {"Hunger: ", "Loved: ", "Bladder: ", "Tired: "};
        String[] playerInput = {"1. Feed " + petName, "2. Praise " + petName, "3. Take " + petName + " for a walk.",
                "4. Let " + petName + " sleep.", "5. Exit Game"};
        
        System.out.println(petName + "'s" + " Needs");
        System.out.println(needs[0] + newPet.getHunger());
        System.out.println(needs[1] + newPet.getLoved());
        System.out.println(needs[2] + newPet.getBladder());
        System.out.println(needs[3] + newPet.getTired());
        System.out.println(" ");

        System.out.println("Commands");
        System.out.println(playerInput[0]);
        System.out.println(playerInput[1]);
        System.out.println(playerInput[2]);
        System.out.println(playerInput[3]);
        System.out.println(playerInput[4]);
        String select = input.nextLine();


        while (true) {
            if (select.contains("1")) {
                System.out.println("You feed " + petName);
                newPet.feed();
                
            } else if (select.contains("2")) {
                System.out.println("You just pet " + petName);
                newPet.praise();

            } else if (select.contains("3")) {
                System.out.println("You let " + petName + " go potty");
                newPet.potty();

            } else if (select.contains("4")) {
                System.out.println("You let " + petName + " get some rest");
                newPet.sleep();

            } else if (select.contains("5")) {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }

            System.out.println(petName + "'s" + " Needs");
            System.out.println(needs[0] + newPet.getHunger());
            System.out.println(needs[1] + newPet.getLoved());
            System.out.println(needs[2] + newPet.getBladder());
            System.out.println(needs[3] + newPet.getTired());
            System.out.println(" ");
            
            System.out.println("Commands");
            System.out.println(playerInput[0]);
            System.out.println(playerInput[1]);
            System.out.println(playerInput[2]);
            System.out.println(playerInput[3]);
            System.out.println(playerInput[4]);
            select = input.nextLine();
        }
    }
}
    




    

