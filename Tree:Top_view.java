public static void topView(Node root) {
        LinkedList<Node>list = new LinkedList<>();
        LinkedList<Integer>level = new LinkedList<>();
        Map<Integer,Integer>nodeMap = new TreeMap<>();
        
        list.add(root);
        level.add(0);
        
        while(!list.isEmpty()){
        Node curr = list.poll();
        int curr_Level = level.poll();
        
        if(!nodeMap.containsKey(curr_Level)){
        nodeMap.put(curr_Level,curr.data);
        }
        
        if(curr.left != null){
            list.add(curr.left);
            level.add(curr_Level-1);
                        
        }
        if(curr.right != null){
            list.add(curr.right);
            level.add(curr_Level+1);
        }
        
        }
      
        for(Map.Entry<Integer,Integer>entry:nodeMap.entrySet()){
         System.out.print(entry.getValue()+" ");   
        }
         
    }
