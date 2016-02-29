////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249 
//  Section:  (your section number) 
// 
//  Project:  Project2
//  File:     Card
//   
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////

/**
 * Simple class to represent a playing card.
 */
public class Card implements Comparable<Card>
{
	// For printing the card rank
	public static String[] RANKS =
	{
		" A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K"
	};

	// For printing the card suit
	// for printing to screen use these: 
	public static String[] SUITS =
	{
		"-C", "-D", "-H", "-S"
	};

	// The card suits
	public static enum Suit
	{
		CLUB,
		DIAMOND,
		HEART,
		SPADE
	}

	// private variables
	private int rank;
	private Suit suit;
	private Card prevCard;	// this is for joining Cards in sequence

	// Constructor : default initialization - Ace of Clubs, prevCard=null
	public Card()
	{
		rank = 1;
        suit = Suit.CLUB;
        prevCard = null;
	}

	// Constructor : initialize rank and suit and prevCard=null
	public Card (int initRank, Suit initSuit)
	{
		// todo: initialize instance variables

	}

	// Return previous Card in sequence
	public Card getPrevCard()
	{
		// todo: Return previous Card in sequence    
	}

	// Set the previous Card in sequence
	public void setPrevCard (Card card)
	{
		// todo: Set the previous Card in sequence
	}

	// Returns relative position of this Card to someCard.
	// This compares the Cards, first by rank: Aces low
	// then Suit within rank: CLUB, DIAMOND, HEART, SPADE
	public int compareTo (Card someCard)
	{
        Integer iRank = new Integer (rank);
		Integer sRank = new Integer (someCard.rank);

		if (rank != someCard.rank)
		{
			return iRank.compareTo (sRank);
		}
		else
		{
			return suit.compareTo (someCard.suit);
		}

	}

	// Print the card's rank and suit
	public String toString()
	{
		String printString = RANKS[rank - 1] + SUITS[suit.ordinal()];
		return printString;
	}
}
