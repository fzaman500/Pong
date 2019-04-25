public class PongPaddle {
  private int x;
  private int y;
  private int height;
  private int width;
  
  public PongPaddle(int y, int x, int width, int height) 
 {
  this.y = y;
  this.x = x;
  this.width = width;
  this.height = height;
 }
  
  public int getLeftX()
  {
    return x;
  }
  
  public int getTopY()
  {
    return y; 
  }
  
  public int getRightX()
  {
    return (x + width); 
  }
  
  public int getBottomY()
  {
    return (y + height); 
  }
  
  public void moveDown(int n)
  {
    y = y + n;
  }
  
  public void moveUp(int n)
  {
    y = y - n;
  }
  
}