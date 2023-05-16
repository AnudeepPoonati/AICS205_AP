import java.util.*;

class Node implements Comparable<Node> {
    int[] state;
    ArrayList<String> actions;
    int cost;
    int heuristicCost;

    public Node(int[] state, ArrayList<String> actions, int cost, int heuristicCost) {
        this.state = state;
        this.actions = new ArrayList<>(actions);
        this.cost = cost;
        this.heuristicCost = heuristicCost;
    }

    @Override
    public int compareTo(Node other) {
        return (this.cost + this.heuristicCost) - (other.cost + other.heuristicCost);
    }
}
