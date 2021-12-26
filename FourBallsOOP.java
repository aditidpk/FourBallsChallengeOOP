import processing.core.PApplet;
public class FourBallsOOP extends PApplet {
    public static final int height = 500;
    public static final int width = 500;
    public static final int ballRadius = 12;
    public static final int parts = 5;
    public static final int speed = 1;
    public static final int xPos = 0;

    public Ball ball;

    public FourBallsOOP(){
        ball = new Ball(this, xPos, height, ballRadius, parts, speed);
    }

    public static void main(String[] args){
        PApplet.main("FourBallsOOP");
    }

    @Override
    public void settings() {
        size(height, width);
    }

    @Override
    public void draw(){
        ball.createBalls();
    }
}
