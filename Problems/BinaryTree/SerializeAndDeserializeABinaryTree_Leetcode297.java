package Problems.BinaryTree;

public class SerializeAndDeserializeABinaryTree_Leetcode297 {
    public static String serialize(TreeNode root) {
        if (root == null) {
            return "null,";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val).append(",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }

    public static TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        return deserializeHelper(dataArray, new int[]{0});
    }

    private static TreeNode deserializeHelper(String[] data, int[] index) {
        if (index[0] >= data.length || data[index[0]].equals("null")) {
            index[0]++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(data[index[0]++]));
        node.left = deserializeHelper(data, index);
        node.right = deserializeHelper(data, index);
        return node;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String serialized = serialize(root);
        System.out.println("Serialized: " + serialized);

        TreeNode deserializedRoot = deserialize(serialized);
        System.out.println("Re-Serialized: " + serialize(deserializedRoot));
    }

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
