import java.util.ArrayList;

public class Trinket
{
    private String description;
    private String trinketName;
    private int buffHealth;
    private int buffMp;
    private int buffStamina;
    private int price;
    public Trinket(String description, String trinketName, int buffStamina, int buffHealth, int buffMp, int price)
    {
        this.description = description;
        this.trinketName = trinketName;
        this.buffStamina = buffStamina ;
        this.buffHealth = buffHealth ;
        this.buffMp = buffMp;
        this.price = price;
    }
    public int increaseHealth(int currentHealth)
    {
        currentHealth = currentHealth + buffHealth;
        return currentHealth;
    }
    public int increaseMp(int currentMp)
    {
       currentMp = currentMp + buffMp;
       return currentMp;
    }
    public int increaseStamina(int currentStamina)
    {
       currentStamina = currentStamina + buffStamina;
       return currentStamina;
    }

    //Getters and setters

    public String getDescription() {
        return description;
    }

    public int getBuffHealth() {
        return buffHealth;
    }

    public int getBuffMp() {
        return buffMp;
    }

    public int getBuffstamina() {
        return buffStamina;
    }

    public String getTrinketName()
    {
        return trinketName;
    }

    public int getPrice() {return price;}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBuffHealth(int buffHealth) {
        this.buffHealth = buffHealth;
    }

    public void setBuffMp(int buffMp) {
        this.buffMp = buffMp;
    }

    public void setBuffstamina(int buffstamina) {
        this.buffStamina = buffstamina;
    }

    public void setTrinketName(String trinketName) {
        this.trinketName = trinketName;
    }

    public void setPrice (int price) {this.price = price;}
}
