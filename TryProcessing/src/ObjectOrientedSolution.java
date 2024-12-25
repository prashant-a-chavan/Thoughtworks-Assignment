import processing.core.PApplet;

public class ObjectOrientedSolution extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    MovingBall b1,b2,b3,b4;

    @Override
    public void setup() {
        b1 = new MovingBall(this,0,HEIGHT/2 - 100, 1);
        b2 = new MovingBall(this, 0, HEIGHT / 2 - 50, 2);
        b3 = new MovingBall(this, 0, HEIGHT / 2, 3);
        b4 = new MovingBall(this, 0, HEIGHT / 2 + 50, 4);
    }

    public static void main(String[] args) {
        PApplet.main("ObjectOrientedSolution", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        b1.updateAndDraw();
        b2.updateAndDraw();
        b3.updateAndDraw();
        b4.updateAndDraw();
    }
}
class MovingBall
{
    PApplet parent;
    int x,y,speed;

    public MovingBall(PApplet parent, int x, int y, int speed) {
        this.parent = parent;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void updateAndDraw()
    {
        parent.ellipse(x,y,10,10);
        x = x + speed;
    }
}
