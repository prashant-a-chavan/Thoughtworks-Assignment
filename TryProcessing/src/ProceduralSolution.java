import processing.core.PApplet;

public class ProceduralSolution extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int first_line = 0;
    int second_line = 0;
    int third_line = 0;
    int fourth_line = 0;


    public static void main(String[] args) {
        PApplet.main("ProceduralSolution",args);
    }

    @Override
    public void setup() {
//        ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
//        getBackground();

//      Solution-1 : Procedural
        ellipse(first_line,HEIGHT/2-100, 10,10);
        first_line = first_line + 1;
        ellipse(second_line,HEIGHT/2-50, 10,10);
        second_line = second_line + 2;
        ellipse(third_line,HEIGHT/2, 10,10);
        third_line = third_line + 3;
        ellipse(fourth_line,HEIGHT/2+50, 10,10);
        fourth_line = fourth_line + 4;

    }

    private void getBackground() {
        background(255);
    }
}