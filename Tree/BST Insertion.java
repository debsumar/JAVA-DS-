public static Node insert(Node root,int data) {

    	if(root==null) 
        {
            return new Node(data);
        }
        if(data<=root.data)
        {
            root.left = insert(root.left,data); //Insert Data to the left sub tree
        }
        else {
            root.right = insert(root.right,data);
        }
        return root; //Return the root
    }