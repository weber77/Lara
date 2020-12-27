
//*************************************************************
// Author: D.S. Malik
//
// This class contains methods for processing voting data for
// student council president's post.
//*************************************************************

import java.util.*;

public class ElectionResult
{
    public static void fillNames(Scanner inFile,
                                 Vector<Candidate> cVector,
                                 int numOfCand)
    {
        String firstN;
        String lastN;

        Candidate temp;

        for (int i = 0; i < numOfCand; i++)
        {
            firstN = inFile.next();
            lastN = inFile.next();
            temp  = new Candidate();
            temp.setName(firstN, lastN);
            cVector.add(temp);
        }
    } //end fillNames

       //Insertion sort algorithm.
       //Postcondition: list objects are in ascending order.
    public static void insertionSort(Vector<Candidate> list, int length)
    {
        for (int firstOutOfOrder = 1; firstOutOfOrder < length;
                                      firstOutOfOrder ++)
        {
            Candidate compElem = list.get(firstOutOfOrder);

            if (compElem.compareTo(list.get(firstOutOfOrder - 1)) < 0)
            {
                Candidate temp = list.get(firstOutOfOrder);

                int location = firstOutOfOrder;

                do
                {
                    list.set(location, list.get(location - 1));
                    location--;
                }
                while (location > 0 &&
                       temp.compareTo(list.get(location - 1)) < 0);

                list.set(location, temp);
            }
        }
    }//end insertionSort

       //Binary search algorithm.
       //Precondition: The list must be sorted.
       //Postcondition: If searchItem is found in the list,
       //               it returns the location of searchItem;
       //               otherwise it returns -1.
    public static int binarySearch(Vector<Candidate> list, int length,
                                   Candidate searchItem)
    {
        int first = 0;
        int last = length - 1;
        int mid = 0;

        boolean found = false;

        while (first <= last && !found)
        {
            mid = (first + last) / 2;

            Candidate compElem = list.get(mid);

            if (compElem.compareTo(searchItem) == 0)
                found = true;
            else if (compElem.compareTo(searchItem) > 0)
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (!found)
            mid = -1;

        return mid;
    }//end binarySearch

    public static void processVotes(Scanner inFile,
                                    Vector<Candidate> cVector)
    {
        String firstN;
        String lastN;
        int region;
        int votes;
        int candLocation;

        Candidate temp;

        while (inFile.hasNext())
        {
            firstN = inFile.next();
            lastN = inFile.next();
            region = inFile.nextInt();
            votes = inFile.nextInt();

            temp = new Candidate();
            temp.setName(firstN, lastN);
            temp.setVotes(region, votes);

            candLocation = binarySearch(cVector, 6, temp);

            if (candLocation != -1)
            {
                temp = cVector.get(candLocation);
                temp.updateVotesByRegion(region, votes);
            }
        }
    } //end processVotes

    public static void addVotes(Vector<Candidate> cVector,
                                int numOfCand)
    {
        Candidate temp;

        for (int i = 0; i < numOfCand; i++)
            cVector.get(i).calculateTotalVotes();
    } //end addVotes

    public static void printHeading()
    {
        System.out.println("--------------------Election Results"
                         + "-----------------\n");
        System.out.println("                         "
                         + "Votes By Region");
        System.out.println("Candidate Name  Rgn#1 \tRgn#2 \t"
                         + "Rgn#3 \tRgn#4 \tTotal");
        System.out.println("--------------  ----- \t----- "
                         + "\t----- \t----- \t-----");
    } //end printHeading

    public static void printResults(Vector<Candidate> cVector,
                                    int numOfCand)
    {
        int largestVotes = 0;
        int sumVotes = 0;
        int winLoc = 0;

        for (int i = 0; i < numOfCand; i++)
        {
            cVector.get(i).printData();

            sumVotes = sumVotes + cVector.get(i).getTotalVotes();

            if (largestVotes < cVector.get(i).getTotalVotes())
            {
                largestVotes = cVector.get(i).getTotalVotes();
                winLoc = i;
            }
        }

        System.out.print("\nWinner: ");
        System.out.print(cVector.get(winLoc).getFirstName() + " "
                       + cVector.get(winLoc).getLastName());
        System.out.println(", Votes Received: "
                       + cVector.get(winLoc).getTotalVotes());
        System.out.println("\nTotal votes polled: " + sumVotes);
    } //end printResults
}