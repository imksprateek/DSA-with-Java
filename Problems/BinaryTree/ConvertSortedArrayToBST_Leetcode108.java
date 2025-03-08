package Problems.BinaryTree;
import Concepts.DataStructures.Tree.BinaryTree.Node;

public class ConvertSortedArrayToBST_Leetcode108 {
    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }

    public static Node sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private static Node buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        Node node = new Node(nums[mid]);

        node.left = buildBST(nums, start, mid - 1);
        node.right = buildBST(nums, mid + 1, end);

        return node;
    }
}
