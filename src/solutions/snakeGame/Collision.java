package solutions.snakeGame;

import java.awt.geom.Rectangle2D;

public class Collision
{
    public static boolean success(SnakeBody snakeBody, SnakeElement snakePart)
    {
        SnakeElement head = snakeBody.getElements().get(0);

        Rectangle2D.Double rectHead = new Rectangle2D.Double(
                        head.getPosition().getX(),
                        head.getPosition().getY(),
                        15,
                        15);

        Rectangle2D.Double rectElem = new Rectangle2D.Double(
                        snakePart.getPosition().getX(),
                        snakePart.getPosition().getY(),
                        15,
                        15);

        if (rectHead.intersects(rectElem))
        {
            return true;
        }
        return false;
    }

    public static boolean fail(SnakeBody snakeBody)
    {
        SnakeElement head = snakeBody.getElements().get(0);

        Rectangle2D.Double rectHead = new Rectangle2D.Double(
                head.getPosition().getX(),
                head.getPosition().getY(),
                15,
                15);

        int len = snakeBody.getElements().size();

        for (int i = 1; i < len; i++)
        {
            Rectangle2D.Double rectElem = new Rectangle2D.Double(
                    snakeBody.getElements().get(i).getPosition().getX(),
                    snakeBody.getElements().get(i).getPosition().getY(),
                    15,
                    15);

            if (rectHead.intersects(rectElem))
            {
                return true;
            }
        }
        return false;
    }
}
