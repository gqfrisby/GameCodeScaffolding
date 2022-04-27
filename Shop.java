import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    private int currency;
    private Trinket trin;
    private Consumable cons1;
    private Consumable cons2;
    private ArrayList<Trinket> trinkets = new ArrayList<Trinket>();
    private ArrayList<Consumable> consumables = new ArrayList<Consumable>();
    public Shop(int currency, ArrayList<Trinket> trinkets, ArrayList<Consumable> consumables, Trinket trin,
                Consumable cons1, Consumable cons2)
    {
        this.currency = currency;
        this.trinkets = trinkets;
        this.consumables = consumables;
        this.trin = trin;
        this.cons1 = cons1;
        this.cons2 = cons2;
    }
    public void openShop() {
        Scanner kb = new Scanner(System.in);
        int choice;
        System.out.println("You stumble across an old tavern on the side of the rode. \n Hesitantly, you walk in.");
        System.out.println("Shopkeeper: \"New Faces are a rare sight out here, hope this isn't the last time we meet\"");
        System.out.println("\"Take a look Around, Prices are about is fair as you can expect\"");
        do {
            System.out.println("=====================================================");
            System.out.println("Currency: " + currency);
            System.out.println("=====================================================");
            System.out.println("     Item 1");
            System.out.println("****" + cons1.getName() + "****");
            System.out.println("Description: " + cons1.getDescription());
            System.out.println("Price: " + cons1.getPrice());
            System.out.println("=====================================================");
            System.out.println("     Item 2");
            System.out.println("****" + cons2.getName() + "****");
            System.out.println("Description: " + cons2.getDescription());
            System.out.println("Price: " + cons2.getPrice());
            System.out.println("=====================================================");
            System.out.println("     Item 3");
            System.out.println("****" + trin.getTrinketName() + "****");
            System.out.println("Description: " + trin.getDescription());
            System.out.println("Price: " + trin.getPrice());
            System.out.println("=====================================================");
            System.out.println("    Exit Shop 4");
            System.out.println("=====================================================");
            System.out.println("What would you like to purchase? ");
            choice = kb.nextInt();
            kb.nextLine();
            switch (choice) {
                case 1:
                    buyCons1();
                    break;
                case 2:
                    buyCons2();
                    break;
                case 3:
                    buyTrinket();
                    break;
                case 4:
                    System.out.println("Good Luck on your \"Journey\", Your gonna need it");
                    break;
                default:
                    System.out.println("Sorry, but that is not a valid option.");
                    break;
            }
        } while (choice != 4);
    }

    public void buyTrinket()
    {
        if(currency >= trin.getPrice()) {
            System.out.println("Pleasure doing business with you, hehehe");
            currency = currency - trin.getPrice();
            trinkets.add(trin);
        }
        else
        {
            System.out.println("Sorry, but this is a shop. Not a Charity");
        }
    }
    public void buyCons1()
    {
        if(currency >= cons1.getPrice())
        {
            System.out.println("Pleasure doing business with you, hehehe");
            currency = currency - cons1.getPrice();
            consumables.add(cons1);
        }
        else
        {
            System.out.println("Sorry, but this is a shop. Not a Charity");
        }
    }
    public void buyCons2()
    {
        if(currency >= cons2.getPrice()) {
            System.out.println("Pleasure doing business with you, hehehe");
            currency = currency - cons2.getPrice();
            consumables.add(cons2);
        }
        else
        {
            System.out.println("Sorry, but this is a shop. Not a Charity");
        }
    }
    public int getCurrency()
    {
        return currency;
    }
    public ArrayList<Trinket> getTrinkets()
    {
        return trinkets;
    }
    public ArrayList<Consumable> getConsumables()
    {
     return consumables;
    }

}
