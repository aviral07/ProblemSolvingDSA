import java.util.ArrayList;
import java.util.Stack;

public class GraphAdjacencyListUsingArrayList {
    ArrayList<ArrayList<Integer>> am = new ArrayList<>();

    public GraphAdjacencyListUsingArrayList(int v){
        for (int i = 0; i < v; i++)
            am.add(new ArrayList<Integer>());

    }

    @Override
    public String toString() {
        return "GraphAdjacencyListUsingArrayList{" +
                "am=" + am +
                '}';
    }

   /* static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {  // s-source d- destination
        am.get(s).add(d);
        am.get(d).add(s);
    }*/

     void addEdge(int source, int destination) {  // s-source d- destination
        am.get(source).add(destination);
        am.get(destination).add(source);
    }

    public boolean dfsStack(int source, int destination) {
        boolean vis[] = new boolean[am.size()];
        vis[source] = true;
        Stack<Integer> stack = new Stack<>();

        stack.push(source);

        while(!stack.isEmpty()) {
            int cur = stack.pop();

            if(cur == destination) return true;

            for(int neighbor: am.get(cur)) {
                if(!vis[neighbor]) {
                    vis[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        return false;
    }

    private boolean dfsUtil(int source, int destination, boolean vis[]) {
        if(source == destination) return true;

        for(int neighbor: am.get(source)) {
            if(!vis[neighbor]) {
                vis[neighbor] = true;
                boolean isConnected = dfsUtil(neighbor, destination, vis);
                if(isConnected) return true;
            }
        }

        return false;
    }
    public boolean dfs(int source, int destination) {
        boolean vis[] = new boolean[am.size()];
        vis[source] = true;

        return dfsUtil(source, destination, vis);
    }

    // Print the graph
   /* static void printGraph(ArrayList<ArrayList<Integer>> am) {
        //GraphAdjacencyListUsingArrayList gAl=new GraphAdjacencyListUsingArrayList(5);
        for (int i = 0; i < am.size(); i++) {
            System.out.println("\nVertex " + i + ":");
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        // Create the graph

        GraphAdjacencyListUsingArrayList gAl=new GraphAdjacencyListUsingArrayList(8);

        // Add edges
        gAl.addEdge(0, 4);
        gAl.addEdge( 4, 3);
        gAl.addEdge( 3, 2);
        gAl.addEdge(2, 1);
        gAl.addEdge(1, 2);
        gAl.addEdge(5, 6);
        gAl.addEdge(6, 7);
        gAl.addEdge(7, 5);

        boolean result=gAl.dfs(0,3);
        System.out.println(result);
    }
    }



