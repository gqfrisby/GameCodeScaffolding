import java.util.ArrayList;

public class Consumable extends Inventory
{
    public String name;
    private String description;
    private int healthEffect;
    private int mpEffect;
    private int price;
    public Consumable(String name, String description, int healthEffect, int mpEffect, int price,
                      ArrayList<Trinket> Trinkets, ArrayList<Consumable> Consumables, int health, int mp)
    {
        super(Trinkets, Consumables, health, mp);
        this.name = name;
        this.description = description;
        this.healthEffect = healthEffect;
        this.mpEffect = mpEffect;
        this.price = price;
    }
// Getters/Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }
    public void setHealthEffect(int healthEffect)
    {
        this.healthEffect = healthEffect;
    }

    public int getHealthEffect()
    {
        return healthEffect;
    }
    public void setMpEffect(int mpEffect)
    {
        this.mpEffect = mpEffect;
    }
    public int getMpEffect()
    {
        return mpEffect;
    }
    public void setprice(int price) {this.price = price;}
    public int getPrice(){return price;}
}
