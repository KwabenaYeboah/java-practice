/**
 * This program perfoms a binary search on a sorted integer array
 */

public class BinarySearchAlgorithm{
    public static void main(String [] args){
        int [] integerArray = {1,2,3,4,5,6,7,8,9,10};

        int searchValue = 9;

        int position = binarySearch(integerArray, searchValue);

        if (position == -1)
            System.out.println("Search value " + searchValue + " was not found");
        else
            System.out.println("Search value " + searchValue + " is found at position " + position);
    }
    /**
     * Here is the binary search method
     * @param array The integer array to be searched.
     * @param vaue The interger number to be searched for
     */

    public static int binarySearch(int[] array, int value){
        int firstIndex=0, lastIndex=array.length-1, middleIndex;

        // Begin search
        while (firstIndex <= lastIndex){
            //calculate middle index
            middleIndex = (firstIndex + lastIndex)/2;
            if (array[middleIndex] == value)
                return middleIndex;
            // else if value is in lower half
            else if (array[middleIndex] > value)
                lastIndex = middleIndex - 1;
            //else the search value is in upper half
            else 
                firstIndex = middleIndex + 1;
        }
        // Return -1 if value not found
        return -1;
    }
}