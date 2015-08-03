package solutions.snakeGame;

public class SnakeElement
{
    private int x;
    private int y;
    private int width;
    private int height;

    public SnakeElement(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setX(int x)
    {
        this.x += x;
    }

    public void setY(int y)
    {
        this.y += y;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("SnakeElement{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
