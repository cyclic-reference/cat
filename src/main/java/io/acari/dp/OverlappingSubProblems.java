package io.acari.dp;

import java.util.Arrays;

public class OverlappingSubProblems {

  public static void main(String... args) {
    OverlappingSubProblems steve = new OverlappingSubProblems();
    System.out.println(steve.fib(21));
    System.out.println(steve.betterFib(21));
    System.out.println(steve.betterFibTabulated(21));
  }

  public int fib(int n) {
    if (n < 2) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }

  public int betterFib(int n) {
    int[] lookup = new int[n];
    Arrays.fill(lookup, Integer.MIN_VALUE);
    return betterFibUtil(n, lookup);
  }

  private int betterFibUtil(int n, int[] lookup) {
    if (n < 2) {
      return n;
    } else if (lookup[n - 1] != Integer.MIN_VALUE) {
      return lookup[n - 1];
    } else {
      int fibby = betterFibUtil(n - 1, lookup) + betterFibUtil(n - 2, lookup);
      lookup[n - 1] = fibby;
      return fibby;
    }
  }

  public int betterFibTabulated(int n) {
    int[] lookups = new int[n + 1];
    lookups[0] = 0;
    lookups[1] = 1;
    for (int i = 2; i <= n; i++) {
      lookups[i] = lookups[i - 1] + lookups[i - 2];
    }

    return lookups[n];
  }
}
