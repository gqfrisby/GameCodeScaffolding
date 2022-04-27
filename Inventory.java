import java.util.ArrayList;
import java.util.Scanner;
public class Inventory
{
    private ArrayList<Trinket> trinkets;
    private ArrayList<Consumable> consumables;
    private int health;
    private int MP;
    private int maxHealth;
    private int maxMP;
    Scanner kb;
    public Inventory(ArrayList<Trinket> trinkets, ArrayList<Consumable> consumables, int health, int mp)
    {
        this.trinkets = trinkets;
        this.consumables = consumables;
        this.health = health;
        this.MP = mp;
    }

    public int viewInventory(int Currency, int health, int MP, int maxHealth, int maxMP, String pName) {
        this.maxHealth = maxHealth;
        this.maxMP = maxMP;
        kb = new Scanner(System.in);
        int choice;
        System.out.println("---" + pName + " Inventory---");
        System.out.print("Trinkets: (");
        for (Trinket i : trinkets) {
            System.out.print(i.getTrinketName() + ",");
        }
        System.out.println(")");
        System.out.print("Consumables: (");
        for (Consumable i : consumables) {
            System.out.print(i.getName() + ",");
        }
        System.out.println(")");
        System.out.println("Wallet: " + Currency + " Gold Coins");
        System.out.println("Health: " + health + "/" + maxHealth + " HP");
        System.out.println("MP: " + MP + "/" + maxMP + " MP");
        do {
            System.out.println("*****Options*****");
            System.out.println("1.) Discard Item");
            System.out.println("2.) Use Consumable");
            System.out.println("3.) Return");
            choice = kb.nextInt();
            kb.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("---" + pName + " Inventory---");
                    System.out.print("Trinkets: (");
                    for (Trinket i : trinkets) {
                        System.out.print(i.getTrinketName() + ",");
                    }
                    System.out.println(")");
                    System.out.print("Consumables: (");
                    for (Consumable i : consumables) {
                        System.out.print(i.getName() + ",");
                    }
                    System.out.println("(1) Remove Trinket, (2) Remove Consumable");
                    int typeDis = kb.nextInt();
                    kb.nextLine();
                    System.out.println("Which one, in number order, would you like to remove? ");
                    int numDis = kb.nextInt();
                    kb.nextLine();
                    try {
                        discardItem(typeDis, numDis);
                    } catch (Exception e) {
                        System.out.println("Sorry, You can't do that");
                    }
                    break;
                case 2:
                    System.out.println("Which Consumable, in number order, would you like to use? ");
                    int conUse = kb.nextInt();
                    return conUse;
                    //health = useHConsumable(conUse, health, maxHealth);
                    //MP = useMConsumable(conUse, MP, maxMP);
                    //consumables.remove(conUse);
                    //System.out.println("Consumable Used");
                case 3:
                    System.out.println("*Inventory Closed*");
                    break;
                default:
                    System.out.println("Sorry, but that is not an option");
                    break;
            }
        } while (choice != 3);
        return 0;
    }

    public void discardItem(int type, int index) {
        if (type == 1) {
            trinkets.remove(index - 1);
        } else {
            consumables.remove(index - 1);
        }
    }
    public int useHConsumable(int index, int currentHealth, int maxHealth)
    {
        if(currentHealth < maxHealth) {
            currentHealth = currentHealth + consumables.get(index).getHealthEffect();
        }
        if (currentHealth > maxHealth)
        {
            currentHealth = maxHealth;
        }
        return currentHealth;
    }
    public int useMConsumable(int index, int currentMP, int maxMP)
    {
        if(currentMP < maxMP) {
            currentMP = currentMP + consumables.get(index).getMpEffect();
        }
        if (currentMP > maxMP) {
            currentMP = maxMP;
        }
        return currentMP;
    }
    public ArrayList<Trinket> getTrinkets()
    {
        return trinkets;
    }

    public void setTrinkets(ArrayList<Trinket> Trinkets)
        {
            this.trinkets = Trinkets;
        }
    public int getHealth()
    {
        return health;
    }
    public int getMP()
    {
        return MP;
    }
    }
