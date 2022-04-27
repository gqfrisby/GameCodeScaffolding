import java.util.Scanner;

public class NPC
{
    private boolean npcAlignment;
    private int npcStrength;
    static Scanner kb = new Scanner(System.in);
    public static void goodNPCInteraction(){
    int input;
    System.out.println("Villager approaches! Villager says: Hi, traveller.");
    System.out.println("\n1. What can you tell me about this area?" +
            "\n2. Up for a trade?" +
            "\n3. [Ignore]");
    input = kb.nextInt();
    if(input == 1){
        System.out.println("");
    }
    if(input == 2){
        System.out.println("");
    }
    if(input == 3){
        System.out.println("Villager: All right, then. See you, I guess.");
    }
}

    public static int badNPCInteraction(int currentCurrency){
        Scanner kb = new Scanner(System.in);
        int input;
        System.out.println("Villager approaches! Villager says: Got any cash?");
        System.out.println("1. [Give 1 coin]");
        System.out.println("2. No, sorry.");
        System.out.println("3. [Ignore]");
        input = kb.nextInt();
        if(input == 1){
            System.out.println("You lost 1 coin.)");
            currentCurrency = currentCurrency -1;
            System.out.println("Villager: That's funny. Got any more?");
            System.out.println("1. No.");
            System.out.println("2. [Give 1 coin]");
            input = kb.nextInt();
            if(input == 1){
                System.out.println("Villager: Well, I got your wallet right here, and you got plenty.");
                System.out.println("The villager robbed you! Money lost...");
                currentCurrency = currentCurrency - 50;
            }
            if(input == 2){
                System.out.println("(You lost 1 coin.)");
                currentCurrency = currentCurrency -1;
                System.out.println("Villager: Yeah, all right. Very, VERY funny.");
                System.out.println("The villager left, grumbling.");
            }
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
                }
            }
            if(input == 2){
                System.out.println("Villager: I'll get you one day. Just wait and see.");
                System.out.println("Villager left, angry.");
            }
        }
        return currentCurrency;
    }
}


    //Getters and setters

