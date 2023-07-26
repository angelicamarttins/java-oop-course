package Exercises.Ex010Matriz;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int column, down, left, right, row, searchedNumber, up;
    int numberExist = 0;
    String position;

    System.out.print("Enter, separated by spaces, the number of rows and columns: ");
    row = sc.nextInt();
    column = sc.nextInt();
    sc.nextLine();

    int[][] matrix = new int[row][column];

    System.out.println("Enter, separated by spaces, the row and column values: ");
    for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
      for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
        matrix[rowIndex][columnIndex] = sc.nextInt();
      }
    }

    System.out.print("Number searched in the matrix: ");
    searchedNumber = sc.nextInt();

    for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
      for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
        if (matrix[rowIndex][columnIndex] == searchedNumber) {
          position = rowIndex + "," + columnIndex;
          left = columnIndex - 1 < 0 ? -1 : matrix[rowIndex][columnIndex - 1];
          right = columnIndex + 1 == column ? -1 : matrix[rowIndex][columnIndex + 1];
          up = rowIndex - 1 < 0 ? -1 : matrix[rowIndex - 1][columnIndex];
          down = rowIndex + 1 == row ? -1 : matrix[rowIndex + 1][columnIndex];

          System.out.println(result(down, left, position, right, up));
        } else {
          numberExist++;
        }
      }
    }

    if (numberExist == row * column) {
      System.out.println("Number doesn't exist in matrix");
    }

    sc.close();
  }

  private static String result(int down, int left, String position, int right, int up) {
    return "Position "
        + position
        + ":"
        + (left == -1 ? "" : "\nLeft: " + left)
        + (right == -1 ? "" : "\nRight: " + right)
        + (up == -1 ? "" : "\nUp: " + up)
        + (down == -1 ? "" : "\nDown: " + down);
  }
}