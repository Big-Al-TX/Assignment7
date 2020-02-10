package assignment7;
public class Card 
{
    private String type;
    private String suit;
    
    public Card(String suitInput, String typeInput)
    {
        type = typeInput;
        suit = suitInput;
    }
    
    public String toString()
    {
        return type + " of " + suit;
    }
}
