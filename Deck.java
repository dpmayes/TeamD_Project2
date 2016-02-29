////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249 
//  Section:  (your section number) 
// 
//  Project:  Project2
//  File:     Deck
//   
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////

/**
 * Class to simulate a deck of playing cards
 */
public class Deck extends MyArrayList<Card>
{
    /**
     * Constructor.  Create an unshuffled deck of cards.
     */
    public Deck()
    {
        // todo: Call the parent constructor passing it 52 for the ArrayList capacity
	// Then call generateDeck
    }

    // Generates deck in bridge order
    public void generateDeck()
    {
        // Add the clubs
        
	// todo

        // Add the diamonds
        
	// todo
        
	// Add the hearts

        // todo

        // Add the spades

        // todo
    }

    /**
     * Put all the cards back into the deck,
     * and shuffle it into a random order
     * by exchanging each card with a random card
     */
    public void shuffle()
    {
        // todo: See slides Lesson 2
    }

    @Override
    public String toString()
    {
        String deckStr = "";

        for (int c = 0; c < size(); c++)
        {
            deckStr = deckStr + get (c).toString() +
                    ((((c+1) % 13) == 0) ? '\n' : ' ');
        }
        return deckStr;
    } 
}
