package solutions.snakeGame;

import java.util.LinkedList;

public class SnakeBody
{
    private SnakeElement head;
    private LinkedList<SnakeElement> body = new LinkedList<>();
    private int bodyCount;

    public SnakeBody(SnakeElement head, int bodyCount)
    {
        this.head = head;
        this.bodyCount = bodyCount;

        body.add(head);

        int x = head.getPosition().getX() - 18;
        int y = head.getPosition().getY();

        for (int i = 0; i < bodyCount; i++)
        {
            body.add(new SnakeElement(new Position(x, y), 15, 15));
            x -= 18;
        }
    }

    public LinkedList<SnakeElement> getElements()
    {
        return body;
    }

    public void recalculate(String direction)
    {
        int len = body.size();

        switch (direction)
        {
            case "LEFT":

                break;
            case "RIGHT":
                for (int i = 0; i < len; i++)
                {
                    body.get(i).moveX(18);
                }
                break;

            case "UP":

                break;

            case "DOWN":

                int headX = body.get(0).getPosition().getX();
                int headY = body.get(0).getPosition().getY();

                body.get(0).moveY(18);

                for (int i = 1; i < len; i++)
                {
                    Position elemPos = body.get(i).getPosition();
                    body.get(i).setPosition(new Position(headX, headY));

                    headX = elemPos.getX();
                    headY = elemPos.getY();
                }
                break;
        }
    }
}
