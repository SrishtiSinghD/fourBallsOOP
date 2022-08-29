import processing.core.PApplet;

public class ball
{
    private int ballWidth;
    private int ballHeight;
    private int pace;
    private int segment;
    private int ballSpeed=0;
    private static int commonSpeed=0;
    private PApplet sketch;

    public ball(PApplet sketch,int ballWidth, int ballHeight, int pace, int segment)
    {
        this.sketch = sketch;
        this.ballWidth = ballWidth;
        this.ballHeight = ballHeight;
        this.pace = pace;
        this.segment = segment;
    }

    public static void accelerate()
    {
        commonSpeed++;
    }
    public void show()
    {
        sketch.fill(sketch.random(255),sketch.random(255),sketch.random(255));
        sketch.ellipse(ballSpeed,segment*(sketch.height/5),ballWidth,ballHeight);
        ballSpeed = commonSpeed*pace;
    }



}
