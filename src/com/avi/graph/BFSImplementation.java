import java.util.ArrayList;
import java.util.LinkedList;

public class BFSImplementation {

    ArrayList<ArrayList<Integer>> am = new ArrayList<>();

    public BFSImplementation(int v){
        for (int i = 0; i < v; i++)
            am.add(new ArrayList<Integer>());

    }
    void addEdge(int source, int destination) {  // s-source d- destination
        am.get(source).add(destination);
        am.get(destination).add(source);
    }

    private  boolean bfs( int src, int des, int v, int pred[], int dist[]) {

        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {

            int cur = queue.remove();

            for (int i = 0; i < am.get(cur).size(); i++) {

                int neighbour = am.get(cur).get(i);
                if (visited[neighbour] == false) {
                    visited[neighbour]=true;
                    dist[neighbour]=dist[cur]+1;
                    pred[neighbour]=cur;
                    queue.add(neighbour);
                    if(neighbour == des)
                        return true;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        BFSImplementation bfsI= new BFSImplementation(8);

       // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=8;
        int e=8;

        bfsI.addEdge(0, 4);
        bfsI.addEdge( 4, 3);
        bfsI.addEdge( 3, 2);
        bfsI.addEdge(2, 1);
        bfsI.addEdge(1, 2);
        bfsI.addEdge(5, 6);
        bfsI.addEdge(6, 7);
        bfsI.addEdge(7, 5);
        int[] pred =new int[v+1];
        int[] dist =new int[v+1];
        boolean isReached=bfsI.bfs(1,0,v,pred,dist);

        System.out.println(isReached);

    }
}
