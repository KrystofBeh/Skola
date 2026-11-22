import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {

        setTitle("Piskvorky");

        setSize(700, 750);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        add(new GamePanel());

        setVisible(true);
    }
}