import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfBinaryTree {
    public static  class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void topView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int minlevel = Integer.MAX_VALUE;
        int maxlevel = Integer.MIN_VALUE;
        while(q.size()>0){
            Pair temp = q.remove(); // give first element of queue
            Node tempNode = temp.node;
            int templevel = temp.level;
            minlevel = Math.min(minlevel,templevel);
            maxlevel = Math.max(maxlevel,templevel);
            if(!map.containsKey(templevel)) map.put(templevel,tempNode.data);
            if(tempNode.left!=null) q.add(new Pair(tempNode.left,templevel -1));
            if(tempNode.right!=null) q.add(new Pair(tempNode.right,templevel +1));
        }
        for (int i = minlevel; i <=maxlevel; i++) {
            IO.print(map.get(i) + " ");
        }


    }

}

class Node {
    int data;
    Node left;
    Node right;
}