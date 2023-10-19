// In Java, an array is a data structure that allows you to store multiple
//  values of the same type under a single variable name. Arrays are useful when you
//  need to work with a collection of elements of the same type.

//syntax:
//dataType[] arrayName = new dataType[arraySize];

public class data{
  public static void main(String a[]){
    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    //multi-dimentional arrays
    //In Java, a multi-dimensional array is an array of arrays. It allows you to store data
    // in a tabular form with rows and columns. To declare and
    //initialize a multi-dimensional array, you can use the following syntax:

    //dataType[]] arrayName = new dataType[rows][columns];

    int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
    }
    System.out.println();
}



  }
}



