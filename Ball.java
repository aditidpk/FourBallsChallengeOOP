import processing.core.PApplet;

public class Ball{
  private final float xPos;
  private final float yPos;
  private final float radius;
  private int parts;
  private int speed;
  
  private int[] posXAxis;
  
  private PApplet app;
  
  public Ball(PApplet app, float xPos, float yPos, float radius, int parts, int speed) {
    this.app = app;
    this.xPos = xPos;
    this.yPos = yPos;
    this.radius = radius;
    this.parts = parts;
    this.speed = speed;
    posXAxis = new int[parts];
  }
  
  public void createBalls(){
    for(int i=0; i<parts-1; i++) {
            app.ellipse(posXAxis[i], (i + 1) * (yPos/parts), radius, radius);
            posXAxis[i] += (speed * (i + 1));
    }
  }

}
