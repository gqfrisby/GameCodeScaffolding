import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;
    private int deckSize;
    private int deckCap = 30;

    public Deck()
    {
        cards = new ArrayList<Card>();
        deckSize = cards.size();
    }

    public void generateDeck(int numberOfCards, String[] names, int[] strengths, int[] defenses, Deck deck)
    {
        for (int f = 0; f < numberOfCards; f++)
        {
            Card card = new Card(names[f], strengths[f], defenses[f]);
            deck.addCard(card);
        }
    }

    public void addCard(Card card)
    {
        cards.add(card);
    }

    public void removeCard(Card card)
    {
        cards.remove(card);
    }

    public String toString()
    {
        System.out.println("Name\t\tStrength\tDefense");

        String string = "";
        for (int i = 0; i < cards.size(); i++)
        {
            string += cards.get(i).toString() + "\n";
        }
        return string;
    }

    public int getDeckSize() {
        return deckSize;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
