package solutions.snakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

public class SnakeGame
{
    private static SnakeElement head = new SnakeElement(100, 100, 10, 10);
    private static LinkedList<SnakeElement> body = new LinkedList<>();

    public static void main(String[] args)
    {
        for (int i = 12; i < 100; i += 12)
        {
            body.add(new SnakeElement(head.getX() - i, 100, 10, 10));
        }

        JFrame frame = new JFrame("SnakeGame");
        frame.setSize(800, 600);

        final JPanel panel = new JPanel()
        {
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g2d.drawRect(head.getX(),
                        head.getY(),
                        head.getWidth(),
                        head.getHeight());

                for (SnakeElement elem : body)
                {
                    g2d.drawRect(elem.getX(),
                            elem.getY(),
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
                        head.setX(-3);

                        for (SnakeElement elem : body)
                        {
                            elem.setX(-3);
                        }

                        panel.repaint();
                        break;
                    case 39:
                        head.setX(3);
                        panel.repaint();
                        break;
                    case 38:
                        head.setY(-3);
                        panel.repaint();
                        break;
                    case 40:
                        head.setY(3);
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
            head.setX(3);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            panel.repaint();
        }
    }
}
