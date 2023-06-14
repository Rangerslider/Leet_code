public class Solution {
 
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) 
    {
        if (node == null) 
        {
           return node; 
        }

        if (map.containsKey(node))
         {
            return map.get(node);
         }

        Node newNode = new Node(node.val, new ArrayList<>());
        map.put(node, newNode);
        for (Node neighbor: node.neighbors)
         {
            newNode.neighbors.add(cloneGraph(neighbor));
        }
        return newNode;
    }
}