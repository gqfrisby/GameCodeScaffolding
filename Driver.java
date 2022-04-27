import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Driver {
    static Player player;
    Enemy enemy = new Enemy();
    static ArrayList<Trinket> ptrinkets;
    static ArrayList<Consumable> pconsumables;
    static ArrayList<Trinket> strinkets =  new ArrayList<Trinket>();
    static ArrayList<Consumable> sconsumables = new ArrayList<Consumable>();
    public static void main(String[] args) {
        String name;
        Scanner kb = new Scanner(System.in);
        Random npc = new Random();
        createConsumables();
        createTrinkets();
        ptrinkets = new ArrayList<Trinket>();
        pconsumables = new ArrayList<Consumable>();
        System.out.println("(Enter your name.)");
        name = kb.nextLine();
        int health = 200;
        int currency = 100;
        int mp = 50;
        int stamina = 50;
        player = new Player(name, health, currency, mp, stamina);
        Inventory playerInven = new Inventory(ptrinkets, pconsumables);
        intro();
        System.out.println("******" + name.toUpperCase() + "'s Stats******");
        System.out.println("You are " + name.toUpperCase() + ".\n" +
                "Health: " + health +
                "\nMoney: " + currency +
                "\nMP: " + mp +
                "\nStamina: " + stamina);
        // location shit
        int choice;
        do {
            System.out.println("********* What would you like to do? *********");
            System.out.println("1.) Battle");
            System.out.println("2.) Rest");
            System.out.println("3.) Trade");
            System.out.println("4.) Shop");
            System.out.println("5.) Talk");
            System.out.println("6.) View Inventory");
            System.out.println("7.) Exit Game");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    player.dealCards();
                    break;
                case 2:
                    System.out.println("You stop by a local tavern for the night.....");
                    System.out.println("Health and MP restored");
                    health = Rest.restoreHealth(health);
                    mp = Rest.restoreMP(mp);
                    break;
                case 3:
                    // Trade
                    break;
                case 4:
                    Shop shop1 = new Shop(currency, ptrinkets, pconsumables, strinkets.get(0), sconsumables.get(0),
                            sconsumables.get(0));
                    shop1.openShop();
                    break;
                case 5:
                    int npcChance = npc.nextInt(2);
                    if (npcChance == 0) {
                       currency = NPC.badNPCInteraction(currency);
                    } else if(npcChance == 1) {
                        NPC.goodNPCInteraction();
                    }
                    else{}
                    npcChance = 0;
                    break;
                case 6:
                    playerInven.viewInventory(currency, health, mp, name);
                    break;
                case 7:
                    System.out.println("Thanks for Playing!");
                    System.exit(0);
                default:
                    System.out.println("Sorry, thats not a valid option");
                    break;
            }
        } while (choice != 7);
    }
    public static void createTrinkets(){
        String trinketName1 = "Emerald Ring of Life";
        String desc1 = "A mystical glowing ring that imbues the wearer with great vigor.(adds 50 Max Health & 10 MP)";
        int stam1 = 0;
        int hp1 = 50;
        int mp1 = 10;
        int price1 = 100;

        String trinketName2 = "Burning Athame";
        String desc2 = "A short blade that warms the palm of the wearer's hand.(Adds 50 Stamina)";
        int stam2 = 50;
        int hp2 = 0;
        int mp2 = 0;
        int price2 = 150;

        String trinketName3 = "Angel Amulet";
        String desc3 = "Amulet with a heavenly glow.(Prevents the wielder from dying. Breaks upon use.)";
        int stam3 = 0;
        int hp3 = 0;
        int mp3 = 0;
        int price3 = 200;

        String trinketName4 = "Lucky Rabbit's Foot";
        String desc4 = "It's a rabbit's foot.(Increases morale.)";
        int stam4 = 0;
        int hp4 = 0;
        int mp4 = 0;
        int price4 = 0;

        String trinketName5 = "Soul of Marmu";
        String desc5 = "A crystal ball with the soul of an ancient wyrm inside.(adds 50 Max Health & 10 MP)";
        int stam5 = 0;
        int hp5 = 10;
        int mp5 = 40;
        int price5 = 0;

        Trinket emeraldRing = new Trinket(desc1, trinketName1, stam1, hp1, mp1, price1);
        Trinket burningAthame = new Trinket(desc2, trinketName2, stam2, hp2, mp2, price2);
        Trinket angelAmulet = new Trinket(desc3, trinketName3, stam3, hp3, mp3, price3);
        Trinket rabbitsFoot = new Trinket(desc4, trinketName4, stam4, hp4, mp4, price4);
        Trinket soulOfMarmu = new Trinket(desc5, trinketName5, stam5, hp5, mp5, price5);
        strinkets.add(emeraldRing);
        strinkets.add(burningAthame);
        strinkets.add(angelAmulet);
        strinkets.add(rabbitsFoot);
        strinkets.add(soulOfMarmu);
    }
    public static void createConsumables()
    {
        String name1 = ("Health Potion");
        String description1 = ("A bright red elixir sealed in a flask");
        int healthEffect1 = 50;
        int mpEffect1 = 0;
        int price1 = 50;

        String name2 = ("MP Potion");
        String description2 = ("A bright blue elixir sealed in a flask");
        int healthEffect2 = 0;
        int mpEffect2 = 30;
        int price2 = 50;

        String name3 = ("Purple Apple");
        String description3 = ("Found in the Shop Keeps hut, you feel as if its calling to you......");
        int healthEffect3 = 100;
        int mpEffect3 = -100;
        int price3 = 0;

        String name4 = ("Leftovers");
        String description4 = ("A seemingly ancient take out box, it exudes a curious aroma");
        int healthEffect4 = -80;
        int mpEffect4 = -30;
        int price4 = 0;

        Consumable healthPotion = new Consumable(name1, description1, healthEffect1, mpEffect1, price1, strinkets,
                sconsumables);
        Consumable mpPotion = new Consumable(name2, description2, healthEffect2, mpEffect2, price2,  strinkets,
                sconsumables);
        Consumable purpleApple = new Consumable(name3, description3, healthEffect3, mpEffect3, price3, strinkets,
                sconsumables);
        Consumable leftovers = new Consumable(name4, description4, healthEffect4, mpEffect4, price4, strinkets,
                sconsumables);
        sconsumables.add(healthPotion);
        sconsumables.add(mpPotion);
        sconsumables.add(purpleApple);
        sconsumables.add(leftovers);
    }
    public static void intro(){
        Scanner kb = new Scanner(System.in);
        System.out.println("A strange, ornate letter sits atop your lopsided, peeling table. Very strange, considering you live" +
                "alone. ...And you locked the door before you left this morning. You should read it." +
                "\n\n'TO WHOM IT MAY CONCERN," +
                "\nGreetings, fated traveller. I am Isdith, leader of the resistance. The fates have selected you, as prophesized" +
                " by the moon. There is warrior's blood in your veins, and magic filling your lungs. You may not know me, but that" +
                " is alright. I am merely a messenger for the gods. Please, traveller, save us from evil, before all is consumed.'");
        System.out.println("\nCertainly, this couldn't have been intended for you. Or could it have? You have always longed for purpose" +
                "and greatness, a chance to prove yourself.");
        System.out.println("\nWould you like to embark on this journey? Y/N");
        String decision = kb.nextLine();
        if(decision.toUpperCase().equals("N")) {
            System.out.println("You walk back to bed.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        if(decision.toUpperCase().equals("Y")){
            System.out.println("Greetings, " + player.getName() + "!");
        }
        else{
            System.out.println("Clearly you're not taking this seriously. Try again when you're ready.");
            System.exit(0);
        }
    }
    public void battle(Player player, Enemy enemy)
    {

    }
    public String winMessage()
    {
        return "";
    }
    public String lossMessage()
    {
        return "";
    }
    public String introduction()
    {
        return "";
    }
}
