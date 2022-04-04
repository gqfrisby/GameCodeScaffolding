import java.util.Scanner;

public class Player
{
    private String name;
    public Scanner kb = new Scanner(System.in);
    private int health;
    private int currency;
    private int mp;
    private int stamina;
    
    public Player(){

    }

    public Player(String name, int health, int currency, int mp, int stamina){
        this.name = "";
        this.health = 200;
        this.currency = 0;
        this.mp = 50;
        this.stamina = 50;
    }

    public void createCharacter(){
        Scanner kb = new Scanner(System.in);
        String input;

        System.out.println("(Enter your name.)");
        input = kb.next();
        name = input;

        System.out.println("You are " + name.toUpperCase() + ".\n" +
                "Health: " + health +
                "\nMoney: " + currency +
                "\nMP: " + mp +
                "\nStamina: " + stamina);
    }

    public int battleCounter()
    {
        return 0;
    }

    public int restCounter()
    {
        return 0;
    }

    public void npcCounter()
    {

    }

    public void attack()
    {

    }

    public void spareEnemy()
    {

    }


    //Getters and setters

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getCurrency() {
        return currency;
    }

    public int getMp() {
        return mp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
