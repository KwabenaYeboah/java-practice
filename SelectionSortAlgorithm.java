/**
 * This program performs a selction sort algorithm
 * on an integer array
 */

public class SelectionSortAlgorithm{

    public static void main(String [] args){
        int [] integerArray = {5,8,4,9,15,12,1,7,10,3,19,20,23,21,32,41,25,2,6,14,30};

        // Display the unsorted array
        System.out.print("This is the integer array before prior to sorting: ");
        for (int val : integerArray)
            System.out.print(val + " ");
        System.out.println();
        // pass the array as an argument to a selection sort method
        selectionSort(integerArray);

        // Display the sorted array
        System.out.print("This is the integer array after sorting: ");
        for (int val : integerArray)
            System.out.print(val + " ");
    }

    /**
     * This method performs the selection sort operation
     * @param array The integer array to be sorted.
     */

    public static void selectionSort(int[] array){
        int startScan, index, minIndex, minValue;

        for(startScan=0; startScan < array.length-1; startScan++){
            minIndex = startScan;
            minValue = array[startScan];
            for(index=startScan+1; index<array.length; index++){

                if (array[index] < minValue){
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
}   
