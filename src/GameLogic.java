public class GameLogic {

    private Player[][] board;
    private Player currentPlayer;

    public GameLogic() {
        board = new Player[10][10];
        currentPlayer = Player.X;
    }

    public boolean makeMove(int row, int col) {

        if (board[row][col] != null) {
            return false;
        }

        board[row][col] = currentPlayer;

        return true;
    }

    public void switchPlayer() {
        if (currentPlayer == Player.X) {
            currentPlayer = Player.O;
        } else {
            currentPlayer = Player.X;
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getCell(int row, int col) {
        return board[row][col];
    }

    public boolean checkWin(int row, int col) {

        Player player = board[row][col];

        int[][] directions = {
                {0, 1},
                {1, 0},
                {1, 1},
                {1, -1}
        };

        for (int[] direction : directions) {

            int count = 1;

            count += countDirection(row, col,
                    direction[0], direction[1], player);

            count += countDirection(row, col,
                    -direction[0], -direction[1], player);

            if (count >= 5) {
                return true;
            }
        }

        return false;
    }

    private int countDirection(int row, int col,
                               int rowDirection, int colDirection,
                               Player player) {

        int count = 0;

        int r = row + rowDirection;
        int c = col + colDirection;

        while (r >= 0 && r < 10 && c >= 0 && c < 10
                && board[r][c] == player) {

            count++;
            r += rowDirection;
            c += colDirection;
        }

        return count;
    }

    public boolean isDraw() {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

                if (board[row][col] == null) {
                    return false;
                }
            }
        }

        return true;
    }
}