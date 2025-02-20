/**
 * A utility class for performing operations on a binary tree of Strings.
 */
public class QuickCheck {

  /**
   * Prints all strings longer than 7 characters in a tree.
   * The strings should be printed in pre-order.
   * Each qualifying string should appear on its own line.
   * 
   * If the node itself is null, the method should print nothing.
   * 
   * You can assume that there are no null Strings stored in the tree nodes.
   *
   * @param node the root node of the binary tree
   */
  public static void printLongerThan7(TreeNode<String> node) {
    // Do nothing, if node is null
    if (node == null) return;
  
    // This checks if current node is longer than 7 characters
    if (node.value.length() > 7) {
      System.out.println(node.value);
    }

    // Calls left and right child
    printLongerThan7(node.left);
    printLongerThan7(node.right);
  }

  /**
   * Returns the sum of all nodes holding odd numbers.
   * 
   * If the node itself is null, return 0.
   * 
   * You can assume there are no null Integers held in the values.
   *
   * @param node the root node of the binary tree
   * @return the sum of all odd-valued nodes
   */
  public static int oddSum(TreeNode<Integer> node) {
    // Do nothing, if node is null
    if (node == null) return 0;

    int sum = 0;
    if (node.value % 2 != 0) {
      // will need more help here

    }
    return sum;
  }
}
