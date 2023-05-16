import java.util.*;

class EightPuzzle {
    int[] initialState;

    public EightPuzzle(int[] initialState) {
        this.initialState = initialState;
    }

    public boolean goalTest(int[] state) {
        return Arrays.equals(state, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 0 });
    }

    public ArrayList<Node> expand(Node node, Heuristic heuristic) {
        ArrayList<Node> nextNodes = new ArrayList<>();
        int i = 0;
        for (; i < 9; i++) {
            if (node.state[i] == 0)
                break;
        }
        // Insert Up, Down, Left, Right actions code here
        return nextNodes;
    }
}
