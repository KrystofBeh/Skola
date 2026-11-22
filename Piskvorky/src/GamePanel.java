import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private JButton[][] buttons;
    private GameLogic logic;
    private JLabel status;

    public GamePanel() {

        logic = new GameLogic();
        buttons = new JButton[10][10];

        setLayout(new BorderLayout());

        status = new JLabel("Na tahu: X", SwingConstants.CENTER);
        status.setFont(new Font("Arial", Font.BOLD, 20));

        add(status, BorderLayout.NORTH);

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(10, 10));

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

                JButton button = new JButton("");

                button.setFont(new Font("Arial", Font.BOLD, 25));
                button.setFocusPainted(false);

                final int r = row;
                final int c = col;

                button.addActionListener(e -> handleClick(r, c));

                buttons[row][col] = button;
                boardPanel.add(button);
            }
        }

        add(boardPanel, BorderLayout.CENTER);
    }

    private void handleClick(int row, int col) {

        Player player = logic.getCurrentPlayer();

        if (!logic.makeMove(row, col)) {
            return;
        }

        buttons[row][col].setText(player.toString());

        if (player == Player.X) {
            buttons[row][col].setForeground(Color.BLUE);
        } else {
            buttons[row][col].setForeground(Color.RED);
        }

        if (logic.checkWin(row, col)) {

            status.setText("Vyhrál hráč " + player);

            disableBoard();

            JOptionPane.showMessageDialog(this,
                    "Vyhrál hráč " + player);

            return;
        }

        if (logic.isDraw()) {

            status.setText("Remíza!");

            JOptionPane.showMessageDialog(this, "Remíza!");

            return;
        }

        logic.switchPlayer();

        status.setText("Tah: " + logic.getCurrentPlayer());
    }

    private void disableBoard() {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                buttons[row][col].setEnabled(false);
            }
        }
    }
}