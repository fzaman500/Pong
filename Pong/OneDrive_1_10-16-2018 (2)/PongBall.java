public class PongBall {
 private int x;
 private int y;
 private int moveX;
 private int moveY;
 
 public PongBall(int x, int y, int moveX, int moveY) 
 {
  this.x = x;
  this.y = y;
  this.moveX = moveX;
  this.moveY = moveY;
 }
  
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  
  public void move()
  {
    x = x + moveX;
    y = y + moveY;
  }
  
  public void bounceX()
  {
    moveX = -1 * moveX;
  }
  
  public void bounceY()
  {
    moveY = -1 * moveY;
  }
  

}