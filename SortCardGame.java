import java.io.File;
import java.io.PrintWriter;

////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249 
//  Section:  (your section number) 
// 
//  Project:  Project2
//  File:     SortCardGame
//   
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////

// Simulates playing the sort card game:
//   Prints a longest decreasing sequence for each Card in last card pile (stack)
//   Uses the Card pile stacks on the Table to return a sorted Deck
//   Passes in the PrintWriter object to the playGame method 
//          to make it easier to print the output to File.

public class SortCardGame
{
    private static final String OUTPUT_FILE = ".\\src\\SortGameOut.txt";

    public static void main(String[] args) throws Exception
    {
	int runs = 5;           // number of games to play,

        // Create an output File writer for Unicode
	// The Unicode enables us to see the Suits as icons
	// If you print this as a regular text file it may look wierd
	// Open up the text file in MS Word and save as a Word doc
        
	File outFile = new File (OUTPUT_FILE);
        PrintWriter writer = new PrintWriter (outFile, "Unicode");

        // Display number of runs
        
	System.out.println ("Playing " + runs + " games.");

        // Loop to play the game for the number of specified runs
        // Display the Begin Game and End Game messages
        
	for (int run = 1; run <= runs; run++)
        {
            writer.println("\n=========== Begin Game " + run + " ==========");

            playGame (writer);

            writer.println("=========== End   Game " + run + " ==========");

        }

        writer.close();

        System.out.println ("Simulation complete.");
        
        return;
    }

    // Simulates playing the sort card game:
    //   Prints a longest decreasing sequence for each Card in last card pile (stack)
    //   Uses the Card pile stacks on the Table to return a sorted Deck
    //   Algorithm:
    //      1.Create the Table and Deck objects
    //      2.Print the Deck before shuffling
    //      3.Shuffle the deck 7 times
    //      4.Print the Deck after shuffling
    //      5.Construct the card piles on the table
    //      6.Print the card piles before doing the sort
    //      7.Print the longest subsequence, passing in PrintWriter
    //      8.Use the piles on the Table to make a sorted Deck
    //      9.Display the sorted Deck
    public static void playGame (PrintWriter writer)
    {
        // Code this using the Algorithm above OR
	// come up with your own algorithm
    }
}

