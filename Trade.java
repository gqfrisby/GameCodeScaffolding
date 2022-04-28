import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Trade extends NPC
{
    Scanner kb = new Scanner(System.in);
    private Consumable consumable;
    private Trinket trinket;
    private ArrayList<Consumable> consumables;
    private Trinket trinketNull;

    public Trade(Trinket trinket, Consumable consumable, ArrayList<Consumable> consumables)
    {
        this.consumable = consumable;
        this.trinket = trinket;
        this.consumables = consumables;
    }

    public int makeTrade(ArrayList<Trinket> trinkets, ArrayList<Consumable> consumable){
        // make return int
        // make int = 1 if trade happens
        // in main set an int = to whatever this returns
        // if int set = 1 then add it otherwise don't from admin array list to player arraylist
        System.out.println("Would you like to make a trade?" +
                "\n1.) Accept"+
                "\n2.) Decline\n");
        int tOption = kb.nextInt();
        if(tOption == 1){
            for(Consumable item : consumable) {
                if (item.getName().equals("Health Potion")) {
                    System.out.println("Offer: 1 Health Potion\n"+
                                        "For: 1 " + trinkets.get(1).getTrinketName() + "\n" +
                                        "1.) Accepts\n" +
                                        "2.) Decline");
                    int tOption2 = kb.nextInt();
                    if(tOption2 == 1){
                        consumable.remove(item);
                        //return trinket;
                        trinketNull = trinkets.get(1);
                        return 1;
                    }
                    else{
                        return 0;

                    }

                }
                else{
                    return 0;

                }
            }


            }
        return 0;
    }

    public ArrayList<Consumable> getConsumables() {
        return consumables;
    }
    public Trinket getTrinketNull(){
        return trinketNull;
    }
    public void setTrinketNull(Trinket trinketNull){
        this.trinketNull = trinketNull;
    }

    public void setConsumable(ArrayList<Consumable> consumable) {
        this.consumables = consumable;
    }
}
