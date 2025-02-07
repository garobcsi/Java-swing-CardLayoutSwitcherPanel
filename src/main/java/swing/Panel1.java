package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel1 extends JPanel implements KeyListener {

    private final CardLayoutSwitcherPanel switcher;

    public Panel1(CardLayoutSwitcherPanel switcher) {
        this.switcher = switcher;

        addKeyListener(this);
        setFocusable(true);
        render();
    }

    private void render() {
        setBackground(Color.pink);

        JLabel label = new JLabel("Panel 1");
        JButton button = new JButton("To panel 2");

        button.addActionListener(e -> {
            switcher.switchTo("panel2");
        });

        add(label, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_2) switcher.switchTo("panel2");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
