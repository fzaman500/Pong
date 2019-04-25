public class PongPaddleTest {
  public static void main(String[] args) {
    //Paddle constructors should be ordered: (topY, leftX, width, height)
    
    System.out.println("\n~Paddle has been set with (10, 20, 3, 12)");
    PongPaddle pdl = new PongPaddle(10,20,3,12);
    System.out.println("getTopY() should return 10, top of the paddle is at: " + pdl.getTopY());
    System.out.println("getBottomY() should return 22, bottom of the paddle is at: " + pdl.getBottomY());
    System.out.println("getLeftX() should return 20, left of the paddle is at: " + pdl.getLeftX());
    System.out.println("getRightX() should return 23, right of the paddle is at: " + pdl.getRightX());
    
    System.out.println("\n~Paddle moves up 5");
    pdl.moveUp(5);
    System.out.println("getTopY() should return 5, top of the paddle is at: " + pdl.getTopY());
    System.out.println("getBottomY() should return 17, bottom of the paddle is at: " + pdl.getBottomY());
    System.out.println("getLeftX() should return 20, left of the paddle is at: " + pdl.getLeftX());
    System.out.println("getRightX() should return 23, right of the paddle is at: " + pdl.getRightX());
    
    System.out.println("\n~Paddle moves down 10");
    pdl.moveDown(10);
    System.out.println("getTopY() should return 15, top of the paddle is at: " + pdl.getTopY());
    System.out.println("getBottomY() should return 27, bottom of the paddle is at: " + pdl.getBottomY());
    System.out.println("getLeftX() should return 20, left of the paddle is at: " + pdl.getLeftX());
    System.out.println("getRightX() should return 23, right of the paddle is at: " + pdl.getRightX());
  }
}