
class Solution {
     /**
     * 从上至下一层一层打印,称之为广度优先搜索,BFS;可以借助队列的先进先出特性来做
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        // 使用队列先进先出的特性
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            // 先将根节点加入队列
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            // 每一层遍历一遍
            // size会随着赋值初始化一遍,即使过程中queue的size变化得等到此次循环结束后重新赋值
            for (int size = queue.size(); size > 0; size--) {
                // 获取每个子TreeNode
                TreeNode node = queue.poll();
                // 记录每层打印结果
                tmp.add(node.val);
                // 获取子节点
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            lists.add(tmp);
        }
        return lists;
    }
}
