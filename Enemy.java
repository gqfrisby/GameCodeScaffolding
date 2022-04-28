import java.util.Random;

public class Enemy
{
    private String name;
    private int health;
    private int baseAttack;
    private String description;


    public Enemy(String name, String description, int health, int baseAttack){
        this.name =  name;
        this.description = description;
        this.health = health;
        this.baseAttack = baseAttack;
    }

    public void attack()
    {

    }

    public void reasonWith()
    {

    }


    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
