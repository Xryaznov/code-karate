package solutions.snakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame
{
    private static SnakeElement head;
    private static SnakeBody body;

    public static void main(String[] args)
    {
        head = new SnakeElement(new Position(150, 150), 15, 15);
        body = new SnakeBody(head, 10);

        JFrame frame = new JFrame("SnakeGame");
        frame.setSize(800, 600);

        final JPanel panel = new JPanel()
        {
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                RenderingHints rh = new RenderingHints(
                        RenderingHints.KEY_TEXT_ANTIALIASING,
                        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2d.setRenderingHints(rh);

                for (SnakeElement elem : body.getElements())
                {
                    g2d.drawRect(elem.getPosition().getX(),
                            elem.getPosition().getY(),
                            elem.getWidth(),
                            elem.getHeight());
                }

            }
        };

        frame.add(panel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        frame.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                switch (e.getKeyCode())
                {
                    case 37:
                        body.recalculate("LEFT");
                        panel.repaint();
                        break;
                    case 39:
                        body.recalculate("RIGHT");
                        panel.repaint();
                        break;
                    case 38:
                        body.recalculate("UP");
                        panel.repaint();
                        break;
                    case 40:
                        body.recalculate("DOWN");
                        panel.repaint();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
            }
        });


        while (true)
        {
            start(panel);
        }
    }

    private static void start(JPanel panel)
    {
        try
        {
            panel.repaint();
            Thread.sleep(150);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
