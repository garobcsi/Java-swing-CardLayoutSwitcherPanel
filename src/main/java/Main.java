import swing.CardLayoutSwitcherPanel;
import swing.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayoutSwitcherPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        frame.setLocationRelativeTo(null);

        CardLayoutSwitcherPanel switcher = new CardLayoutSwitcherPanel();
        switcher.addPanel("panel1", new Panel1(switcher));
        switcher.addPanel("panel2", new Panel2(switcher));

        switcher.registerKeyListener("panel1");
        switcher.registerKeyListener("panel2");

        switcher.switchTo("panel1");

        frame.add(switcher);

        frame.setVisible(true);
    }
}
