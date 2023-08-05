import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class GenerateMap
{
    // for generating  bricks
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    private int totalBricks;


    public GenerateMap (int row, int col)
    {
        map = new int[row][col];
        for(int i = 0; i<map.length; i++)
        {
            for(int j =0; j<map[0].length; j++)
            {
                map[i][j] = 1;
            }
        }

        brickWidth = 740/col;
        brickHeight = 150/row;
        totalBricks = 60;
    }

    public void draw(Graphics2D g)
    {
        for(int i = 0; i<map.length; i++)
        {
            for(int j =0; j<map[0].length; j++)
            {
                if(map[i][j] > 0)
                {
                    g.setColor(Color.pink);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // to show separate bricks
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col)
    {
        map[row][col] = value;
        totalBricks -= 1;
    }
    public int getTotalBricks() {
        return totalBricks;

    }

}