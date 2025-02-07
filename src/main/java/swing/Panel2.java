package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel2 extends JPanel implements KeyListener {

    private final CardLayoutSwitcherPanel switcher;

    public Panel2(CardLayoutSwitcherPanel switcher) {
        this.switcher = switcher;

        addKeyListener(this);
        setFocusable(true);
        render();
    }

    private void render() {
        setBackground(Color.gray);

        JLabel label = new JLabel("Panel 2");
        JButton button = new JButton("To panel 1");

        button.addActionListener(e -> {
            switcher.switchTo("panel1");
        });

        add(label, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_1) switcher.switchTo("panel1");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
