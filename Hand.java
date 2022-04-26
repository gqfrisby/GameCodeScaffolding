import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hand
{
    private Deck deck;
    private ArrayList<Card> cardsInHand;
    private int handSize;
    private Random rand = new Random();
    private boolean[] dealBool;
    private int numberOfCardsDealt;

    public Hand(Deck deck)
    {
        dealBool = new boolean[deck.getCards().size()];
        cardsInHand = new ArrayList<Card>();
        this.handSize = cardsInHand.size();

        for (int x = 0; x < deck.getCards().size(); x++)
        {
            dealBool[x] = false;
        }
    }

    public void deal(Deck deck, Hand hand, int numberOfCardsDealt)
    {

        for (int i = 0; i <= numberOfCardsDealt; i++)
        {
            int handCards = rand.nextInt(deck.getCards().size());


            if (dealBool[handCards] == false){
                cardsInHand.add(deck.getCards().get(handCards));
                dealBool[handCards] = true;
            }

            else if (hand.isOut(dealBool) == true){continue;}

            else if (dealBool[handCards] = true){
                i--;
            }
        }
    }

    public boolean isOut(boolean[] dealBoo)
    {

        for (int i = 0; i < dealBool.length; i++){
            if (!dealBoo[i]) return false;
        }
        return true;
    }


    public Card playCard(Hand hand, int cardNumber)
    {
        Card card = hand.getCardsInHand().get(cardNumber);
        hand.getCardsInHand().remove(cardNumber);
        return card;
    }

    public String toString()
    {
        System.out.println("Name\t\tStrength\tDefense");

        String string = "";
        for (int i = 0; i < cardsInHand.size(); i++)
        {
            string += i + ". ";
            string += cardsInHand.get(i).toString() + "\n";
        }
        return string;
    }

    public int getHandSize() {
        return handSize;
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }
}
