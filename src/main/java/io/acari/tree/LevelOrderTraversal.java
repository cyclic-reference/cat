package io.acari.tree;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class LevelOrderTraversal {

    public java.util.stream.Stream<Integer> traverseTree(TreeNode root) {
        final java.util.stream.Stream.Builder<Integer> bob = java.util.stream.Stream.builder();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            Set<TreeNode> visited = new HashSet<>();
            while (!queue.isEmpty()) {
                TreeNode poll = queue.poll();
                bob.add(poll.getData());
                visited.add(poll);
                processNode(queue, visited, poll.getLeft());
                processNode(queue, visited, poll.getRight());
            }
        }
        return bob.build();
    }

    private void processNode(Queue<TreeNode> queue, Set<TreeNode> visited, TreeNode left) {
        if (left != null && !visited.contains(left)) {
            queue.add(left);
        }
    }


}
