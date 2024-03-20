import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    //background(255);
    stroke(0);
    strokeWeight(2);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    line(((width/2)),0,((width/2)),height);
    line(0, height/2, width, height/2 );
	  for(int lineX = 0; lineX <= width/2; lineX += (width/20)) {
      line(lineX,0, lineX, height/2);
    }
    for(int lineY = 0; lineY <= width/2; lineY += (width/20)) {
      line(0,lineY,height/2,lineY);
    }
    for (int circleX = (width/2)+((height/2)*8); circleX <= width; circleX += 30){
      ellipse((circleX), height/2, 15, 15);
    }
  }
}
