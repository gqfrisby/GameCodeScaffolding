import java.util.Random;
import java.util.Scanner;

public class NPC
{
    private boolean npcAlignment;
    private int npcStrength;

    static Scanner kb = new Scanner(System.in);

    public static void goodNPCInteraction(){
        int input;
        System.out.println("Child villager approaches! Villager says: Hi, traveller.");
        System.out.println("\n1. What can you tell me about this area?" +
                "\n2. Hello." +
                "\n3. [Ignore]");
        input = kb.nextInt();
        if(input == 1){
            System.out.println("Villager: We are a very poor town indeed. My mother had to get another job last week!");
            System.out.println("\n1. I'm sorry to hear that." +
                    "\n2. I'm going to help you.");
            input = kb.nextInt();
                if(input == 1){
                    System.out.println("Villager: I wish someone would save us.");
                    System.out.println("(The villager left, downtrodden.)");
                }
                if(input == 2){
                    System.out.println("Villager: Really? Well, then you'll need my help, too!");
                    System.out.println("(The villager hands you something. You're not exactly sure what it's supposed to do.");
                    System.out.println("(The villager leaves, skipping.)");
                }
        }
        if(input == 2){

            System.out.println("Villager: Are you the one the moon spoke of?");
            System.out.println("\n1. Yes, of course." +
                    "\n2. I guess...");
            input = kb.nextInt();
                if(input == 1){
                    System.out.println("Villager: Good!");
                    System.out.println("(The villager left, excited.)");
                }
                if(input == 2){
                    System.out.println("You don't sound too confident. I wish they sent someone else.");
                    System.out.println("(The villager left, worried.)");
                }
        }
        if(input == 3){
            System.out.println("Villager: All right, then. See you, I guess.");
        }
        else System.out.println("You screamed some weird gibberish. Villager left, bewildered.");
    }

    public static int badNPCInteraction(int currentCurrency){
        Scanner kb = new Scanner(System.in);
        int input;
        System.out.println("Villager approaches! Villager says: Got any cash?");
        System.out.println("""

                1. [Give 1 coin]
                2. No, sorry.
                3. [Ignore]""");
        input = kb.nextInt();
        if(input == 1){
            currentCurrency = currentCurrency -1;
            System.out.println("(You lost 1 coin. Money: " + currentCurrency + ")");

            System.out.println("Villager: That's funny. Got any more?");
            System.out.println("""

                    1. No.
                    2. [Give 1 coin]""");
            input = kb.nextInt();
            if(input == 1){
                System.out.println("Villager: Well, I got your wallet right here, and you got plenty.");
                System.out.println("The villager robbed you! Money lost...");
                currentCurrency = currentCurrency - 50;

            }
            if(input == 2){
                currentCurrency = currentCurrency -1;
                System.out.println("(You lost 1 coin. Money: " + currentCurrency + ")");
                System.out.println("Villager: Yeah, all right. Very, VERY funny.");
                System.out.println("The villager left, grumbling.");
            }
            else System.out.println("You screamed some weird gibberish. Villager left, bewildered.");
        }
        if(input == 2){
            System.out.println("Villager: You sure?");
            System.out.println("""

                1. I'm on an important mission.
                2. VERY sure.
                3. [Ignore]""");
            input = kb.nextInt();
            if(input == 1){
                System.out.println("Villager: Doesn't sound important. You're no fun.");
                System.out.println("The villager left, bored.");
            }
            if(input == 2){
                System.out.println("Villager: Well, I got your wallet right here, and you got plenty.");
                System.out.println("The villager robbed you! Money lost...");
                //add amount of money later
            }
            if(input == 3){
                System.out.println("Fine. Be that way.");
                System.out.println("The villager left, grumbling.");
            }
            else System.out.println("You screamed some weird gibberish. Villager left, bewildered.");
        }
        if(input == 3){
            System.out.println("Villager: Hey! I was talking to you!");
            System.out.println("""

                    1. No money. Sorry.
                    2. [Ignore]""");
            input = kb.nextInt();
            if(input == 1){
                System.out.println("Villager: Are you that hero? That one supposed to save us all? You don't look like much.");
                System.out.println("""

                    1. Yeah. Maybe.
                    2. [Ignore]""");
                input = kb.nextInt();
                if(input == 1){
                    System.out.println("Villager: Some hero you are.");
                    System.out.println("Villager left, disappointed.");
                }
                if(input == 2) {
                    System.out.println("Villager: Some hero you are.");
                    System.out.println("Villager left, disappointed.");
                }        else System.out.println("You screamed some weird gibberish. Villager left, bewildered.");
            }
            if(input == 2){
                System.out.println("Villager: I'll get you one day. Just wait and see.");
                System.out.println("Villager left, angry.");
            }        else System.out.println("You screamed some weird gibberish. Villager left, bewildered.");
        }
        return currentCurrency;
    }


    //Getters and setters

    public boolean getNPCAlignment() {
        return npcAlignment;
    }

    public int getNpcStrength() {
        return npcStrength;
    }

    public void setNpcAlignment(boolean npcAlignment) {
        Random align = new Random();
        this.npcAlignment = align.nextBoolean();
        getNPCAlignment();
        if(npcAlignment == true){
            goodNPCInteraction();
        }
    }

    public void setNpcStrength(int npcStrength) {
        this.npcStrength = npcStrength;
    }
}
