package io.acari.tree;

import io.acari.tree.pojo.Node;

public class DeepestLeftNode {

  //todo: this later, if ever never maybe?
  public Node find(Node root) {
    if (root != null) {
      return rootUtl(root, 0, 0);
    }

    return root;
  }

  public Node rootUtl(Node root, int max, int currentLevel) {
    if (root != null) {
      Node rightChild = root.right;
      currentLevel++;
      Node leftChild = root.left;
      if (leftChild.left == null) {
        if (currentLevel > max) {
          return leftChild;
        } else {
          Node lowestLeftLeft = rootUtl(leftChild, max, currentLevel);

        }
      } else {

        return rightChild;
      }


    }

    return root;

  }
}
