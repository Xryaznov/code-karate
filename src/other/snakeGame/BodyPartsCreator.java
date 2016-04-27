package other.snakeGame;

import javax.swing.*;
import java.util.Random;

public class BodyPartsCreator
{
    private static SnakeElement elem;

    public static SnakeElement createNew(JPanel panel)
    {
        Random rnd = new Random();

        int x = rnd.nextInt(panel.getWidth());
        int y = rnd.nextInt(panel.getHeight());

        int remainder = x % 18;

        if (remainder != 0)
            x = x - remainder;

        remainder = y % 18;

        if (remainder != 0)
            y = y - remainder;

        elem = new SnakeElement(new Position(x, y), 15, 15);
        return elem;
    }
}
