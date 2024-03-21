
import processing.core.PApplet;

public class Sketch extends PApplet {
	int Y_AXIS = 1;
  int X_AXIS = 2;
  //int b1, b2, c1, c2;
  int colour = 0;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    noLoop();
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
    stroke(0);
    strokeWeight(2);
    //int b1 = 255;
    //int b2 = 0;
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
    for (double circleX = (width/2) + (width/25) ; circleX <= width; circleX += (width/10.6)){
      for (int circleY = 0; circleY <= height/2; circleY += (height/8.5)){
          fill(255, 0, 255);
          ellipse((int) (circleX+10), (circleY-30), width/15, height/15);
      }  
    }
    for(int lineX2 = 0; lineX2 <= width/2; lineX2 += 1) {
      colour = lineX2*255/(width/2);
      stroke(colour ,colour,colour);
      line(lineX2, height, lineX2, height/2);
      }
  
  for(int ypos = 0; ypos <= 360; ypos += 45 ){
    pushMatrix();
    ellipseMode(CENTER);
    fill(255,0,0);
    translate((height-(height/4)), width/2 + (width/4));
    rotate(radians(360-ypos));
    ellipse(0,0, 180, 40);
    popMatrix();
   }
  fill(1, 50, 32);
  ellipse(height-(height/4), width/2 + (width/4), 40, 40);
  }
     
      
}
  


  

