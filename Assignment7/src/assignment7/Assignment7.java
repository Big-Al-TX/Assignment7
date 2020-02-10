package assignment7;
public class Assignment7 
{
    public static void main(String[] args) 
    {
        String[] types = {"1","2","3","4","5","6","7","8","9","10","J","Q","K", "A"};
        String[] suits = {"♠", "♥", "♣", "♦"};
        Deck d = new Deck(types, suits);
        System.out.println(d.toString());
    }
    
}
