public static void levelOrder(Node root) {
         if(root == null) return;
      Queue<Node> queue = new LinkedList<Node>();
      //Add root to the queue
       queue.add(root);
       
       while(!queue.isEmpty()){
           Node node = queue.remove();
           System.out.print(node.data + " ");
           if(node.left != null) queue.add(node.left);
           if(node.right != null) queue.add(node.right);   
       }
      
    }