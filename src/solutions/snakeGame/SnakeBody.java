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

        int headX = body.get(0).getPosition().getX();
        int headY = body.get(0).getPosition().getY();

        switch (direction)
        {
            case "LEFT":
                body.get(0).moveX(-18);
                break;
            case "RIGHT":
                body.get(0).moveX(18);
                break;
            case "UP":
                body.get(0).moveY(-18);
                break;
            case "DOWN":
                body.get(0).moveY(18);
                break;
        }

        for (int i = 1; i < len; i++)
        {
            Position elemPos = body.get(i).getPosition();
            body.get(i).setPosition(new Position(headX, headY));

            headX = elemPos.getX();
            headY = elemPos.getY();
        }
    }

    public void addSnakePart(SnakeElement snakePart)
    {
        body.add(snakePart);
    }
}
