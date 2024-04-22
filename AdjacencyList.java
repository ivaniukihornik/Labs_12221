public class AdjacencyList {

    public static void addEdge(int[][] adjacencyList, int i, int j) {
        adjacencyList[i][j] = 1;
        adjacencyList[j][i] = 1;
    }

    public static void printAdjacencyList(int[][] adjacencyList) {
        for (int i = 0; i < adjacencyList.length; i++) {
            System.out.print(i + " -> ( ");
            for (int j = 0; j < adjacencyList[i].length; j++) {
                if (adjacencyList[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(")");
        }
    }
    public static void main(String[] args) {
        int vertices = 5;
        int[][] adjacencyList = new int[vertices][vertices];

        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 2);
        addEdge(adjacencyList, 0, 3);
        addEdge(adjacencyList, 0, 4);

        addEdge(adjacencyList, 1, 2);

        addEdge(adjacencyList, 2, 4);

        addEdge(adjacencyList, 3, 4);


        System.out.println("Adjacency list for graph:");
        printAdjacencyList(adjacencyList);
    }
}