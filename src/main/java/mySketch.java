import processing.core.PApplet;
import java.util.ArrayList;

public class mySketch extends PApplet
{
    private int widthSketch=750;
    private int heightSketch=750;
    private int ballRadius=25;
    private ArrayList<ball> balls = new ArrayList<>();

    public static void main(String[] args)
    {
        PApplet.main("mySketch");
    }

    @Override
    public void settings()
    {
        size(widthSketch,heightSketch);
        for (int i = 1; i < 5; i++)
        {
            balls.add(new ball(this,ballRadius,ballRadius,i,i));
        }
    }

    @Override
    public void setup()
    {
        background(0);
    }

    @Override

    public void draw()
    {
        for (ball B:balls)
        {
            B.show();
        }
        ball.accelerate();
    }


}
