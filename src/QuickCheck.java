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
    /*
    if node is null print nothing
    traverse a tree in pre-order
    if node.value.length > 7 = print
     */

    if (node == null) return;

    if (node.value.length() > 7) System.out.println(node.value);
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
    /*
    if node is null return 0
    create int sum variable
    if node.value % 2 != 0 its odd = add to the sum
    recursively traverse left and right subtrees
     */

    if (node == null) return 0;

    int sum = 0;
    
    if (node.value % 2 != 0) {
      sum += node.value;
    }

    sum += oddSum(node.left);
    sum += oddSum(node.right);

    return sum;
  }
}