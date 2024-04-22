public class Graph {
    public int vertices;
    public int[][] adjacencyMatrix;

    public Graph(int numVertices) {
        this.vertices = numVertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j) {
        adjacencyMatrix[i][j] = 0;
        adjacencyMatrix[j][i] = 0;
    }

    public void printMatrix() {
        for (int i = -1; i < vertices; i++) {
            for (int j = -1; j < vertices; j++) {
                if (i == -1) {
                    if (j == -1) {
                        System.out.print("  ");
                    } else {
                        System.out.print(j + " ");
                    }
                } else {
                    if (j == -1) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print(adjacencyMatrix[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        System.out.println("Adjacency matrix for graph:");
        graph.printMatrix();

        graph.removeEdge(0, 2);
        System.out.println("Adjacency matrix for graph after removing some edges:");
        graph.printMatrix();
    }
}