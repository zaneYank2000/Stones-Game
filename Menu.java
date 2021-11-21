import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame
{
    JButton startGame, howToPlay, exitGame;
    StonesGame game = new StonesGame();
    
    Menu()
    {
        startGame = new JButton("Start Game");
        startGame.setBounds(0, 0, 100, 45);
        startGame.addActionListener((e) -> {
            game.setVisible(true);
            this.hide();
        });



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(420, 420);
        this.setVisible(true);

        this.add(startGame);
    }
}
