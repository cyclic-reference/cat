package io.acari;


//Y u looking at dis?
public class Main {

  public static void printArray(int[][] lookup) {
    for (int[] ints : lookup) {
      for (int anInt : ints) {
        System.out.print(anInt + "\t");
      }
      System.out.println();
    }
  }

  public static void printArray(boolean[][] lookup) {
    for (boolean[] ints : lookup) {
      for (boolean anInt : ints) {
        System.out.print(anInt + "\t");
      }
      System.out.println();
    }
  }

  public static void printArray(long[][] lookup) {
    for (long[] ints : lookup) {
      for (long anInt : ints) {
        System.out.print(anInt + "\t");
      }
      System.out.println();
    }
  }
}