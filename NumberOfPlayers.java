import javax.swing.JButton;
import javax.swing.JFrame;

public class NumberOfPlayers extends JFrame
{
    JButton onePlayer, twoPlayers;

    NumberOfPlayers()
    {
        onePlayer = new JButton("1 Player");
        onePlayer.addActionListener((e) -> {
            new Computer();
        });

        twoPlayers = new JButton("2 Players");
        twoPlayers.addActionListener((e) -> {
            new Computer();
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 200);
        this.setLocationRelativeTo(null);

        this.add(onePlayer);

    }
}
