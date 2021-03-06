package io.acari.dp;

import java.util.*;

public class MinJumps {

  public long find(Integer[] jumpy) {
    Deque<Pair<Integer, Integer>> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();
    queue.offer(new Pair<>(jumpy[0], 0));
    int jumps = 0;
    PriorityQueue<Pair<Integer, Integer>> weighted = new PriorityQueue<>(Comparator.comparing(a -> a.fst));
    int lengthLessOne = jumpy.length - 1;
    while (!queue.isEmpty()) {
      Pair<Integer, Integer> currentNode = queue.poll();
      Integer index = currentNode.snd;
      if (index == lengthLessOne) {
        return jumps;
      }
      visited.add(index);
      int neighbors = currentNode.fst;
      while (neighbors > 0) {
        int next = index + neighbors--;
        if (next == lengthLessOne) {
          return ++jumps;
        }
        if (next < jumpy.length && !visited.contains(next)) {
          weighted.offer(new Pair<>(jumpy[next], next));
        }
      }

      while (!weighted.isEmpty()) {
        queue.push(weighted.poll());
      }

      if (!queue.isEmpty()) {
        jumps++;
      }
    }

    return -1;
  }
}


class Pair<A, B> {
  public final A fst;
  public final B snd;

  public Pair(A var1, B var2) {
    this.fst = var1;
    this.snd = var2;
  }

  public static <A, B> Pair<A, B> of(A var0, B var1) {
    return new Pair<>(var0, var1);
  }

  public String toString() {
    return "Pair[" + this.fst + "," + this.snd + "]";
  }

  public boolean equals(Object var1) {
    return var1 instanceof Pair && Objects.equals(this.fst, ((Pair) var1).fst) && Objects.equals(this.snd, ((Pair) var1).snd);
  }

  public int hashCode() {
    return this.fst == null ? (this.snd == null ? 0 : this.snd.hashCode() + 1) : (this.snd == null ? this.fst.hashCode() + 2 : this.fst.hashCode() * 17 + this.snd.hashCode());
  }
}