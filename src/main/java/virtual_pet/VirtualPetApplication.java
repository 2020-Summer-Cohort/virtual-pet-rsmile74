package virtual_pet;


import java.util.Scanner;

//This class is VirtualPetApplication
public class VirtualPetApplication {


    public static void main(String[] args) throws InterruptedException {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);
        VirtualPet myPet = new VirtualPet();


        System.out.println("Welcome to your Virtual Pet");
        System.out.println("you will use 1-5 options to take care of your pet, please make your pet is happy.");

        System.out.println("Please name you lovely pet?");
        String name = input.nextLine();
        System.out.println("Nice to meet you, " + name);

        System.out.println("  /\\_/\\ ");
        System.out.println("   o_o ");
        System.out.println("  = v =   ");


        System.out.println("Which option would you like to choose");
        System.out.println("Press 1 if your pet is hungry");
        System.out.println("Press 2 if your pet is thirsty");
        System.out.println("Press 3 if your pet is boredom");
        System.out.println("Press 4 if your pet is tiredness");
        System.out.println("Press 5 if your pet is not feeling well");
        System.out.println("Press 6 to exit");
        String userEntered = input.nextLine();


        while (!userEntered.equals("6")) {

            if (userEntered.equals("1")) {
                myPet.feed(); //method
                System.out.println("Poor " + name + " is soo hungry. " + myPet.getHunger());
                Thread.sleep(3000);
                System.out.println("make sure you feed " + name + ".");

            } else if (userEntered.equals("2")) {
                myPet.thirst(); //method
                System.out.println("Hey " + name + " is dying of thirst. " + myPet.getThirst());
                Thread.sleep(3000);
                System.out.println(name + " had some very dry food, your pet is really thirsty.");

                myPet.boredom(); //method
            } else if (userEntered.equals("3")) {
                System.out.println(name + " is sooo bored! " + myPet.getBoredom());
                Thread.sleep(3000);
                System.out.println(name + " is so lonely please play with your pet.");

                myPet.tireness(); //method
            } else if (userEntered.equals("4")) {
                System.out.println(name + " is very tired. " + myPet.getTiredness());
                Thread.sleep(3000);
                System.out.println(name + " is now tired after playing, probably needs a nap");

                myPet.sickness(); //method
            } else if (userEntered.equals("5")) {
                System.out.println("Oh noooo " + name + " is sick! " + myPet.getSickness());
                Thread.sleep(3000);
                System.out.println(name + " may need to go to the vet, make sure to schedule a check up.");

            } else {
                System.out.println("no such number");
            }
            myPet.tick();
            Thread.sleep(3000);

            System.out.println("Which option would you like to choose");
            System.out.println("Press 1 if your pet is hungry");
            System.out.println("Press 2 if your pet is thirsty");
            System.out.println("Press 3 if your pet is boredom");
            System.out.println("Press 4 if your pet is tiredness");
            System.out.println("Press 5 if your pet is not feeling well");
            System.out.println("Press 6 to exit");
            userEntered = input.nextLine();



        }

    }

}
