import processing.core.PApplet;
import sun.plugin.services.WIExplorerBrowserService;

import java.nio.file.Watchable;

public class Main extends PApplet
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    MovingBalls b1,b2,b3,b4;

    public static void main(String[] args) {
        PApplet.main("Main",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        b1 = new MovingBalls(this,0,HEIGHT/2 - 100,1);
        b2 = new MovingBalls(this,0,HEIGHT/2 - 50,2);
        b3 = new MovingBalls(this,0,HEIGHT/2 ,3);
        b4 = new MovingBalls(this,0,HEIGHT/2 + 50,4);

    }

    @Override
    public void draw() {
        b1.update_and_draw();
        b2.update_and_draw();
        b3.update_and_draw();
        b4.update_and_draw();
    }
}

class MovingBalls
{
    PApplet papplet;
    int x,y,speed;

    public MovingBalls(PApplet papplet, int x, int y, int speed) {
        this.papplet = papplet;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update_and_draw()
    {
        papplet.ellipse(x,y,10,10);
        x = x + speed;
    }

}