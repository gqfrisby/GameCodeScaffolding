import java.util.ArrayList;

public class Consumable extends Inventory
{
    private static String name;
    private String description;
    private int healthEffect;
    private int mpEffect;
    public Consumable(String name, String description, int healthEffect, int mpEffect,
                      ArrayList<Trinket> Trinkets, ArrayList<Consumable> Consumables)
    {
        super(Trinkets, Consumables);
        this.name = name;
        this.description = description;
        this.healthEffect = healthEffect;
        this.mpEffect = mpEffect;
    }
// Getters/Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public static String getName()
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
}
