interface Heuristic {
    int calculate(int[] state);
}

class MisplacedTileHeuristic implements Heuristic {
    @Override
    public int calculate(int[] state) {
        int misplaced = 0;
        for (int i = 0; i < 9; i++) {
            if (state[i] != 0 && state[i] != i + 1)
                misplaced++;
        }
        return misplaced;
    }
}

class ManhattanDistanceHeuristic implements Heuristic {
    @Override
    public int calculate(int[] state) {
        int distance = 0;
        for (int i = 0; i < 9; i++) {
            if (state[i] != 0) {
                distance += Math.abs(i / 3 - (state[i] - 1) / 3) + Math.abs(i % 3 - (state[i] - 1) % 3);
            }
        }
        return distance;
    }
}
