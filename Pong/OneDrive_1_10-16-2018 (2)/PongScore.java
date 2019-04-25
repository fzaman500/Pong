public class PongScore 
{
  private int score;
  
  public PongScore() 
  {
    score = 0;
  }
  
  public PongScore(int x) 
  {
    score = x;
  }
  
  public int getScore()
  {
    return score;
  }
  
  public void scorePoints(int n) 
  {
    score = score + n;
  }
  
    
}