import processing.core.PApplet;
import processing.core.PShapeSVG.LinearGradient;

public class proscgradient extends PApplet {
    int Y_AXIS = 1;
  int X_AXIS = 2;
  int b1, b2, c1, c2;
    void setGradient(int x, int y, float w, float h, int b1, int b2, int axis ) {

        noFill();
      
        if (axis == Y_AXIS) {  // Top to bottom gradient
          for (int i = y; i <= y+h; i++) {
            float inter = map(i, y, y+h, 0, 1);
            int c = lerpColor(c1, c2, inter);
            stroke(c);
            line(x, i, x+w, i);
          }
        }  
        else if (axis == X_AXIS) {  // Left to right gradient
          for (int i = x; i <= x+w; i++) {
            float inter = map(i, x, x+w, 0, 1);
            int c = lerpColor(c1, c2, inter);
            stroke(c);
            line(i, y, i, y+h);
          }
        }
    
    }
}
