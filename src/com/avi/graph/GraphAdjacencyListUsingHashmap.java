import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class GraphAdjacencyListUsingHashmap {

    HashMap<Integer, LinkedList<Integer>> adjList = new HashMap<>();

    void addEdge(int src, int dest){

        if(!adjList.containsKey(src)){

            LinkedList<Integer> nodes= new LinkedList<>();

            nodes.add(dest);

            adjList.put(src,nodes);

        }

        else{

            LinkedList<Integer> nodes= adjList.get(src);

            nodes.add(dest);

            adjList.put(src,nodes);

        }

    }

    Set getNodes(){

        return adjList.keySet();

    }


    void displayGraph(){

        for(Map.Entry m: adjList.entrySet()){

            System.out.println(m.getKey()+" ==> " + m.getValue());

        }

    }


    public static void main(String[] args) {

        GraphAdjacencyListUsingHashmap g = new GraphAdjacencyListUsingHashmap();

        g.addEdge(1,4);

        g.addEdge(1,3);

        g.addEdge(2,5);

        g.addEdge(2,1);

        g.addEdge(3,4);

        g.addEdge(3,2);

        System.out.println("Vertices = " + g.getNodes());

        g.displayGraph();

    }
}
