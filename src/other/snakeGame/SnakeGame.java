package other.snakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame
{
    private static SnakeElement head;
    private static SnakeElement bodyPart;
    private static SnakeBody body;
    private static String direction = "RIGHT";

    public void go()
    {
        head = new SnakeElement(new Position(144, 144), 15, 15);
        body = new SnakeBody(head, 4);

        JFrame frame = new JFrame("SnakeGame");
        frame.setSize(816, 624);

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

                    g2d.fillRect(elem.getPosition().getX() + 2,
                            elem.getPosition().getY() + 2,
                            elem.getWidth() - 3,
                            elem.getWidth() - 3);
                }

                if (bodyPart != null)
                {
                    g2d.drawRect(bodyPart.getPosition().getX(),
                            bodyPart.getPosition().getY(),
                            bodyPart.getWidth(),
                            bodyPart.getHeight());

                    g2d.fillRect(bodyPart.getPosition().getX() + 2,
                            bodyPart.getPosition().getY() + 2,
                            bodyPart.getWidth() - 3,
                            bodyPart.getWidth() - 3);
                }
            }
        };

        frame.add(panel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
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
                        if (!direction.equals("LEFT") && !direction.equals("RIGHT"))
                        {
                            body.recalculate("LEFT");
                            direction = "LEFT";
                            panel.repaint();
                        }
                        break;
                    case 39:
                        if (!direction.equals("RIGHT") && !direction.equals("LEFT"))
                        {
                            body.recalculate("RIGHT");
                            direction = "RIGHT";
                            panel.repaint();
                        }
                        break;
                    case 38:
                        if (!direction.equals("UP") && !direction.equals("DOWN"))
                        {
                            body.recalculate("UP");
                            direction = "UP";
                            panel.repaint();
                        }
                        break;
                    case 40:
                        if (!direction.equals("DOWN") && !direction.equals("UP"))
                        {
                            body.recalculate("DOWN");
                            direction = "DOWN";
                            panel.repaint();
                        }
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
            new SnakeGame().start(panel);
        }


    }

    private void start(JPanel panel)
    {
        try
        {
            body.recalculate(direction);

            if (bodyPart == null)
            {
                double rnd = Math.random();

                if (rnd < 0.05)
                {
                    bodyPart = BodyPartsCreator.createNew(panel);
                }
            }

            SnakeElement head = body.getElements().get(0);
            Position headPos = head.getPosition();


            if (Collision.fail(body))
            {
                gameOver(panel);
                System.exit(1);
            }

            if (bodyPart != null)
            {
                if (Collision.success(body, bodyPart))
                {
                    body.addSnakePart(bodyPart);
                    bodyPart = null;
                }
            }


            int height = panel.getHeight();
            int width = panel.getWidth();


            if (headPos.getY() < 0)
            {
                head.setPosition(new Position(headPos.getX(), height - 18));
            }

            if (headPos.getY() > height)
            {
                head.setPosition(new Position(headPos.getX(), 0));
            }

            if (headPos.getX() < 0)
            {
                head.setPosition(new Position(width - 18, headPos.getY()));
            }

            if (headPos.getX() > width)
            {
                head.setPosition(new Position(0, headPos.getY()));
            }

            panel.repaint();
            Thread.sleep(150);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    private void gameOver(JPanel panel)
    {
        JOptionPane.showMessageDialog(panel, "GAME OVER");
    }
}
