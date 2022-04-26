public class Card extends Deck
{
    private String name;
    private int strength;
    private int defense;

    Card(String name, int strength, int defense)
    {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
    }

    public String toString()
    {
        return name + "\t\t\t" + strength + "\t\t\t"+ defense;
    }
    //Getters and setters

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

}
