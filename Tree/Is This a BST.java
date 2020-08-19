boolean checkBST(Node root) {
    return checkBST(root, 0, 10000);
}
    boolean checkBST(Node root, int min, int max) {
        
        if (root == null) {
        return true;
    } else if (root.data < min || root.data > max) { // we assume BST cannot have duplicate values
        return false;
    } else {
        return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
    }
        
    }