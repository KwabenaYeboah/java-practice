/** 
 A java program to calculate the sum of lower
  triangular elements of a given 3d matrix
*/

public class LowerTriangular{
    public static void main(String[] args){

        int [][] matrix = { {87,75,92}, {76,78,81}, {98, 93, 99} };

        int sum = sumLowerTriangular(matrix);

        System.out.println("The sum of the lower of Triangular matrix is " + sum);
    }

    /**
     The sumLowerTriangular method returns the sum of 
     lower Triangular elements of the matrix
     @param array The 2d array to reference matrix
    */

    public static int sumLowerTriangular(int [][] array){
        int sum = 0;
        int row, column;

        for(row=0; row < array.length; row++){
            for(column=0; column < array[row].length;  column++){
                if (!(row < column))
                    sum += array[row][column];
            }
        }
        return sum;
    }
}