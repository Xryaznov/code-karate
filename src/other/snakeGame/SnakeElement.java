package other.snakeGame;

public class SnakeElement
{
    private Position position;
    private int width;
    private int height;

    public SnakeElement(Position position, int width, int height)
    {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public Position getPosition()
    {
        return position;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void moveX(int x)
    {
        position.setX(position.getX() + x);
    }

    public void moveY(int y)
    {
        position.setY(position.getY() + y);
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("SnakeElement{");
        sb.append("position=").append(position);
        sb.append('}');
        return sb.toString();
    }
}
