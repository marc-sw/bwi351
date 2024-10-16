package de.hwglu.bwi351_1.v04Sortieren;

import java.util.Arrays;
import java.util.function.Function;

public class P2BubbleSort {
  public static void main(String[] args) {
    debug(P2BubbleSort::sortOptimized, new int[] { 5, 3, 8, 9, 2, 1});
  }

  public static int sort(int[] array) {
      int placeholder;
      int steps = 0;
      for (int i = 0; i < array.length - 1; i++) {
          for (int j = 0; j < array.length - 1 - i; j++) {
              steps++;
              if (array[j] > array[j + 1]) {
                  placeholder = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = placeholder;
              }
          }
      }
      return steps;
  }

  public static int sortOptimized(int[] array) {
      int placeholder;
      boolean sorted = false;
      int steps = 0;
      for (int i = 0; i < array.length - 1 && !sorted; i++) {
          sorted = true;
          for (int j = 0; j < array.length - 1 - i; j++) {
              if (array[j] > array[j + 1]) {
                  steps++;
                  placeholder = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = placeholder;
                  sorted = false;
              }
          }
      }
      return steps;
  }

  public static void debug(Function<int[], Integer> sortingAlgorithm, int[] array) {
      System.out.println("Das unsortierte Array: ");
      System.out.println(Arrays.toString(array));
      System.out.printf("Das sortierte Array nach %d Schritten: %n", sortingAlgorithm.apply(array));
      System.out.println(Arrays.toString(array));
  }
}