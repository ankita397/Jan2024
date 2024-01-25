/*
 * This is for undirected unweighted graph representation using Adjacency matrix
 * Array(matrix) -> adj[n+1][n+1]
 * adj[node1][node2] = adj[node2][node1] = 1
 * 
 * For directed unweighted graph - adj[node1][node2] = 1  -- don't assign adj[node2][node1] = 1
 * 
 * SC = O(n^2) - so used for only smaller graphs
 */

public class GraphAdjMatrix {
	public static void main(String [] args){
	      int n = 5; int m = 6;
	      int adj[][] = new int[n+1][n+1];
	      
	      addUndirectedEdge(adj, 1,2);
	      addUndirectedEdge(adj, 1,3);
	      addUndirectedEdge(adj, 2,4);
	      addUndirectedEdge(adj, 2,5);
	      addUndirectedEdge(adj, 3,4);
	      addUndirectedEdge(adj, 4,5);
	      
	      for(int i=0;i<=n;i++) {
  	  		for(int j=0;j<=n;j++) {
  	  			System.out.print(adj[i][j] + " ");
  	  		}
	  		  System.out.println();	  	
	      }	      
	  }

	  private static void addUndirectedEdge(int[][] adj,int firstNodeIndex, int secondNodeIndex) {
			adj[firstNodeIndex][secondNodeIndex] = 1;
			adj[secondNodeIndex][firstNodeIndex] = 1;
	  }
	  
	 
}
