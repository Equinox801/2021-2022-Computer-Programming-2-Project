import javax.swing.*;
import java.awt.geom.*;
class Entity{
  Entity(){
    double xpos;
    double ypos;
    double width;
    double height;
  }

  // public void hitBox(double tempX, double tempY, double tempR, double tempL){
  //   Ellipse2D.Double hb = new Ellipse2D.Double(tempX, tempY, (tempR*2), (tempR*2));
    
    
  // }
}

class VectorEntity extends Entity{
  VectorEntity(){
    double hbRadius;
    
  }  

  
}

class NonVectorEntity extends Entity{
  
}

class Player extends VectoralEntity{
  Player(double tempX, double tempY, double tempWidth, double temp, double tempHBR){
    
  }
}