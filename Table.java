import java.io.PrintWriter;

////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249 
//  Section:  (your section number) 
// 
//  Project:  Project2
//  File:     Table
//   
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
///////////////////////////////////////////////////////////////////////////////

// The Table holds each of the piles of cards.
// It creates the piles from the deck of cards,
// prints a list of the longest decreasing subsequences,
// and retrieves the Cards in sorted order

public class Table
{
    private MyArrayList<MyStack<Card>> piles;
    private int numPiles;

    // Constructor
    public Table()
    {
        // todo: Initiaze instance variables
    }

    // This method creates the piles (stacks) from the cards,
    // according to the following rules:
    //  1. Initially, there are no piles. The first Card dealt
    //     forms a new pile consisting of the first Card.
    //  2. Each new Card picked from the Deck must be placed on top 
    //     of the leftmost pile (lowest MyArrayList index), whose
    //     top Card has a value higher than the new Card's value.
    //  3. If there are only piles with top Cards that are lower 
    //     in value than the new Card's value, then use the new 
    //     Card to start a new pile to the right of all the 
    //     existing piles (at end of MyArrayList of MyStack piles)
    //  4. Whenever a new Card is placed on top of a pile (stack), 
    //     put a prevCard reference in that new Card (setPrevCard()) 
    //     to the top Card in the previous pile (stack) to the left 
    //     of this pile. (By design, the pile's top Card has a lower 
    //     value than the value of the new Card)
    //  5. The game ends when all the cards have been dealt
    //
    // Dealing the cards in this way provides us a way of retrieving 
    // a subset of the longest increasing and decreasing subsequences.
    //   a. The number of piles is the length of a longest subsequence.
    //   b  Whenever a card is placed on top of a pile (stack), put a
    //      reference in that new Card (setPrevCard()) to the top Card 
    //      in the previous pile (stack) to the left of this pile.
    //      (By design, the pile's top Card has a lower value 
    //       than the value of the new Card)
    //	 c. In the printSeq() function, follow the prevCard references
    //      starting from the cards in the last pile to recover a subset
    //      of the decreasing subsequences of the longest length
    //
    // The Algorithm:
    // Loop through each card in the Deck
    //     A. Retrieve the card from the deck
    //     B. Set flag to indicate that we haven't yet placed 
    //        the new Card in an existing pile 
    //     C. Loop through each pile starting from the leftmost(0) to 
    //        find the correct one on which to place the new Card
    //           a. Retrieve top Card using peek
    //           b. If there exists a pile whose top Card is
    //              is higher than the currently dealt new Card, then
    //               i.   Set flag to say we have found a pile on
    //                    which to place the new Card
    //               ii.  Retrieve a reference to the top Card on the 
    //                    previous pile and place it in the new Card's 
    //                    prevCard variable
    //               iii. Push the new Card onto the pile
    //     D. Check flag: 
    //        If we haven't found a place for the new Card in an 
    //        existing pile, then
    //           a. Create a new pile (in MyArrayList of MyStacks)
    //           b. Retrieve a reference to the top Card on the previous 
    //              pile and place it in the new Card's prevCard variable
    //           c. Push the new Card onto the pile
    //           d. Increment the pile count
    public void constructCardPiles (Deck deck)
    {
        Card cardFromDeck = null;
        Card cardFromTable = null;

        // Code the rest using the Algorithm above OR
	// come up with your own algorithm
    }

    // Use the passed in PrintWriter to print each pile
    // (stacks) on the MyArrayList of MyStacks
    public void printCardPiles (PrintWriter writer)
    {
        // Code this
    }

    // Print each of the longest decreasing and increasing subsequences
    // The subsequences start with each Card in the last, rightmost pile
    //
    // For example: 
    // If there are 4 Cards in the last pile (stack), print 4 longest 
    //    decreasing subsequences, each one starting with a different 
    //    Card in the last  pile (stack).
    //
    // This is tricky: You want to get to all the Cards in the last pile 
    // and still have the last pile in its proper order when you are done.
    // Remember: You have a stack and can only access the top Card.
    // The best way of doing this is to use a temporary stack for
    // holding the Cards from the last pile, as you pop them off 
    // and then, when you have finishing creating the subsequences, 
    // push them back onto the original last pile.
    //
    // Walking through the linked Cards will produce the longest 
    // decreasing subsequences: however, you must also print the 
    // longest increasing subsequences.  This can be done using
    // another stack to reverse the Cards obtained for the
    // decreasing subsequence.
    //
    // Algorithm:
    // A. Get reference to last pile (stack) on the table
    // B. Create a temporary stack for storing the cards on
    //    the last pile (stack) when we pop() them to walk 
    //    through the subsequence list
    // C. Walk through the Cards in the last pile (stack)
    //      a. Start the String for holding longest decreasing sequence
    //      b. Get the top Card off the last pile and save it in the temp stack      
    //      c. Get another stack to use to reverse the Cards for the decreasing 
    //         subsequence in order to obtain the Cards for the increasing subsequence
    //      d. While the card in not null,
    //           1. Push it on stack for obtaining increasing subsequence
    //           2. Add the card to the decreasing subsequence 
    //           3. Get the next card in the subsequence 
    //           4. Keep looping until the next Card is null
    //      e. Print the decreasing subsequence
    //      f. Start the String for holding longest increasing sequence
    //      g. Pop off the Card from the stack for increasing subsequence 
    //         and add it to the increasing subsequence String
    //      h. While the stack for increasing subsequence is not empty
    //           1. Pop off the Card from the stack for increasing subsequence
    //           2. Add it to the increasing subsequence String
    //           3. Keep looping until the stack is empty
    //      i. Print the increasing subsequence
    // D. Return the cards from the temporary stack back to the last pile
    public void printLongestSeqs (PrintWriter writer)
    {
        // Code this using the Algorithm above OR
	// come up with your own algorithm
    }

    // Builds a sorted Deck by looking at each pile (stack)
    // and grabbing the card with the lowest value
    // and placing it in its proper order in the deck
    //
    // Algorithm:
    // Loop for each card in the deck
    //   A. Keep an index to the pile with the lowest card, so far
    //   B. Keep the lowest Card found so far
    //   C. Initialize it to the highest card for starters
    //   D. Walk across the piles (stacks) and find the index of the 
    //      pile (stack) with smallest card, by using the Card compareTo method 
    //      Note: Dont' pop() the card yet, it may not be the overall lowest
    //      Update the the lowest Card and its stack index along the way
    //   E. Now that we have exited the walk of the piles, we know the index 
    //      of the stack (pile) with the lowest Card, pop() that Card from 
    //      the stack (pile) and put it into the proper place in the Deck
    public void makeSortedDeck (Deck deck)
    {
        // Code this using the Algorithm above OR
	// come up with your own algorithm
    }
}