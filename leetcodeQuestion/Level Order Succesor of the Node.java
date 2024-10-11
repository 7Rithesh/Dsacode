class Solution {
    public TreeNode levelOrderBottom(TreeNode root, int key) {
        if(root == null){
          return null;}
        queue.offer(root);
      while(queue != null){
        for(int i = 0 ; i < levelSize; i++){
        List<TreeNode> currentList = new ArrayList<>();
        int currentNode = queue.poll();
       
        if(currentNode.left != null{
          qeueu.offer(currentNode.left)
          }
        if(currentNode.right != null{
          qeueu.offer(currentNode.right)
          }
           if(currentNode.val == key.val){
          // currentNode = queue.poll(); method - 1
             break;
        }
    }
      }

      // return currentNode.val; method - 1
      return queue.peek();
}
}
