package solutions.snakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame
{
    public static float x = 50;
    public static float y = 50;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("SnakeGame");
        frame.setSize(800, 600);

        JPanel panel = new JPanel()
        {
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;
                g2d.drawString("snake", x, y);
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
                        System.out.println("LEFT");
                        x--;
                        panel.repaint();
                        break;
                    case 39:
                        System.out.println("RIGHT");
                        x++;
                        panel.repaint();
                        break;
                    case 38:
                        System.out.println("UP");
                        y--;
                        panel.repaint();
                        break;
                    case 40:
                        System.out.println("DOWN");
                        y++;
                        panel.repaint();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
            }
        });
    }
}
