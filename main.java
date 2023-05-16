import java.util.*;

class Main {
    static void generalSearch(EightPuzzle problem, Heuristic heuristic) {
        PriorityQueue<Node> nodes = new PriorityQueue<>();
        nodes.add(new Node(problem.initialState, new ArrayList<>(), 0, heuristic.calculate(problem.initialState)));
        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            if (problem.goalTest(node.state)) {
                System.out.println("Solution: " + node.actions + ", Cost: " + node.cost);
                return;
            }
            nodes.addAll(problem.expand(node, heuristic));
        }
        System.out.println("No solution found.");
    }

    public static void main(String[] args) {
        int[] initialState = {2, 8, 3, 1, 6, 4, 7, 0, 5};
        EightPuzzle problem = new EightPuzzle(initialState);
        System.out.println("Using Uniform Cost Search:");
        generalSearch(problem, state -> 0);
        System.out.println("Using A* with Misplaced Tile heuristic:");
        generalSearch(problem, new MisplacedTileHeuristic());
        System.out.println("Using A* with Manhattan Distance heuristic:");
        generalSearch(problem, new ManhattanDistanceHeuristic());
    }
}