public static void topView(Node root) {
      
      if(root==null) return;
        class Pair //Inner Class
        {
            Node node;
            int dist;
            Pair(Node node,int dist){
                this.node = node;
                this.dist = dist;
            }
        }
        Queue<Pair> q = new LinkedList<>(); //Humaara queue pair type ki cheezen store karega
        TreeMap<Integer,Node> map = new TreeMap<>(); //<Distance,Node> - TreeMap to store sorted by keys
        q.add(new Pair(root,0)); //Adding root with its horizontal distance
        while(!q.isEmpty())
        {
            Pair temp = q.poll();
            int dist = temp.dist;
            if(!map.containsKey(dist))//If the distance occurs first time
            {
                map.put(dist,temp.node); //Key is distance, Value is the first node
            }
            //Add children to queue
            if(temp.node.left!=null)
            {
                q.add(new Pair(temp.node.left,dist-1)); //distance will be temp ka dist - 1;
            }
            if(temp.node.right!=null)
            {
                q.add(new Pair(temp.node.right,dist+1)); //distance will be temp ka dist + 1;
            }
        }
        //TreeMap has been successfully created at this point
        for(Integer key:map.keySet())
        {
            System.out.print(map.get(key).data+" "); //.get krne par Node aagya, uska data print krdo
        }
        System.out.println();
      
    }