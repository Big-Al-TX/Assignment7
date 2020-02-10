package assignment7;
public class Deck 
{
    private Card cards[];
    private int currentCard;
    
    public Deck(String[] types, String[] suits)
    {
        currentCard = 0;
        
        int counter = 0;
        for(int i = suits.length; i > 0; i--)
        {
            for(int j = types.length; i > 0; i--)
            {
                cards[counter] = new Card(suits[i],types[j]);
                counter++;
            }
        }
    }
    
    public void selectionShuffle()
    {
        
    }
    
    public Card dealCard()
    {
        currentCard++;
        return cards[currentCard];
    }
    
    public String toString()
    {
        String output = "";
        for(int i = cards.length - 1; i > 0; i--)
            output += cards[i] + ", ";
        return output;
    }
}
